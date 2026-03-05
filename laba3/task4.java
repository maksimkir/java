public class task4 {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) return null;
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) max = element;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 5, 3};
        String[] words = {"Dog", "Zebra", "Cat"};
        System.out.println("Max num: " + findMax(nums));
        System.out.println("Max word: " + findMax(words));
    }
}