public class task1 {
    public static void main(String[] args) {
        byte myByte = 10;
        // У Java результат додавання byte + int стає int, 
        // тому потрібне явне приведення типів.
        myByte = (byte) (myByte + 5); 
        
        System.out.println("Результат додавання: " + myByte);
    }
}