public class Assignment5 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        reverse(array);
    }

    private static void reverse(int[] array) {
        for (int value : array)
            System.out.println(value);
        System.out.println();
        for (int i = array.length -1; i >= 0; i--)
            System.out.println(array[i]);

    }

    }
