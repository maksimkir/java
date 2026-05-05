import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.*;
import java.util.concurrent.Semaphore;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class Theater {
    private final int totalSeats;
    private int availableSeats;
    
    // 12. 
    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    // 9. 
    private final Lock lock = new ReentrantLock();
    // 15. 
    private final Condition seatAvailable = lock.newCondition();
    // 6.
    private final AtomicInteger bookingCounter = new AtomicInteger(0);
    // 14.
    private final Semaphore ticketOfficeLimits = new Semaphore(3);

    public Theater(int seats) {
        this.totalSeats = seats;
        this.availableSeats = seats;
    }

    // Метод  12 
    public void printStatus() {
        rwLock.readLock().lock();
        try {
            System.out.println("Status: " + availableSeats + " seats free.");
        } finally {
            rwLock.readLock().unlock();
        }
    }

    public void bookTicket(String userName) {
        try {
            // 14. Semaphore(кор пот)
            ticketOfficeLimits.acquire();
            // 10. 
            lock.lockInterruptibly(); 
            try {
                // 11. tryLock
                if (lock.tryLock()) { 
                    try {
                        // 13, 15. 
                        while (availableSeats <= 0) {
                            System.out.println(userName + " is waiting for a seat...");
                            seatAvailable.await(); 
                        }

                        // 7, 8. 
                        availableSeats--;
                        bookingCounter.incrementAndGet(); // 6. 
                        System.out.println(userName + " BOOKED! Left: " + availableSeats);
                    } finally {
                        lock.unlock();
                    }
                }
            } finally {
                lock.unlock();
                ticketOfficeLimits.release();
            }
        } catch (InterruptedException e) {
            // 2. Примусова зупинка
            Thread.currentThread().interrupt();
        }
    }

    private final Object monitor = new Object();
    public void cancelBooking() {
        // 16.
        synchronized (monitor) {
            lock.lock();
            try {
                availableSeats++;
                System.out.println("--- Seat freed! ---");
                seatAvailable.signal(); // 15.
            } finally {
                lock.unlock();
            }
            monitor.notifyAll(); // 16. 
        }
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        // вивід
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Theater theater = new Theater(2);
        
        // 1. ств пот
        Runnable task = () -> {
            theater.printStatus(); // 12. 
            theater.bookTicket(Thread.currentThread().getName());
        };

        // 4. 
        Thread t1 = new Thread(task, "Client-1");
        Thread t2 = new Thread(task, "Client-2");
        Thread t3 = new Thread(task, "Client-3");

        t1.setPriority(Thread.MAX_PRIORITY); // 4. Пріор 
        
        t1.start();
        t2.start();
        t3.start();

        // 3. Очікування 
        Thread.sleep(1000); 
        
        // 1. Потік для звільнення місця
        new Thread(theater::cancelBooking, "System-Cancel").start();

        // 5. 
        t1.join();
        t2.join();
        t3.join();
        
        System.out.println("Program finished.");
    }
}