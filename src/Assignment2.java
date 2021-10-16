import java.util.Objects;

public class Assignment2 {
    public static void main(String[] args) {
        int[] arrayNumbers = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        negativeLoop(arrayNumbers);
        System.out.println();
        oddLoop(arrayNumbers);
        System.out.println();
        oddQuantity(arrayNumbers);
        System.out.println();
        duplicates(arrayNumbers);
        System.out.println();
        secondNr(arrayNumbers);
        System.out.println();
        averageValue(arrayNumbers);
        System.out.println();
        lessAverage(arrayNumbers);
    }

    public static void negativeLoop(int[] arrayNumbers) {
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] < 0)
                System.out.println(arrayNumbers[i]);
        }
    }

    public static void oddLoop(int[] arrayNumbers) {
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 2 != 0)
                System.out.println(arrayNumbers[i]);
        }
    }

    public static void oddQuantity(int[] arrayNumbers) {
        int oddCount = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 2 != 0)
                System.out.println(arrayNumbers[i]);
            oddCount++;
            //it doesn't count how many numbers, just printing the odd ones
        }
    }

    public static void duplicates(int[] arrayNumbers) {
        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = i + 1; j < arrayNumbers.length; j++) {
                if (Objects.equals(arrayNumbers[i], arrayNumbers[j]))
                    System.out.println(arrayNumbers[i]);
            }
        }
    }

    public static void secondNr(int[] arrayNumbers) {
        for (int i = 1; i < arrayNumbers.length; i = i + 2)
            System.out.println(arrayNumbers[i]);
        //I've decided to print elements starting from second element, that is number 4
        //to print starting from 1st element int i must be equal 0

    }

    public static void averageValue(int[] arrayNumbers) {
        double total = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            total = total + arrayNumbers[i];
        }
        double average = total / arrayNumbers.length;
        System.out.println(average);
    }

    public static void lessAverage(int[] arrayNumbers) {
        double total = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            total = total + arrayNumbers[i];
            double average = total / arrayNumbers.length;
            if (average >= arrayNumbers[i])
                //I've put sign >= so number 3 could be printed, otherwise it wasn't counted as a number that is less than 3.2
                System.out.println(arrayNumbers[i]);
        }
    }
}