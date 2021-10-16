import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String1 {
    public static void main(String[] args) {
        String[] array = {"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination" };
        startC(array);
        endE(array);
        length5(array);
        characterE(array);
        characterTe(array);
    }

    private static void startC(String[] array) {
        System.out.println("Words start with C: ");
        int count = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i].charAt(0) == 'C')
                count++;
        {
            System.out.println(count);
        }
    }

    public static void endE(String[] array) {
        System.out.println("Words end with E:");
        int count = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i].endsWith("e"))
                count++;
        {
            System.out.println(count);
        }
    }

    public static void length5(String[] array) {
        System.out.println("Words with length 5: ");
        int count = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i].length() == 5)
                count++;
        {
            System.out.println(count);
        }
    }

    private static void characterE(String[] array) {
        System.out.println("Words with character E: ");
        int count = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i].contains("e"))
                count++;
        {
            System.out.println(count);
        }
    }

    private static void characterTe(String[] array) {
        System.out.println("Words contain character Te: ");
        int i = 0;
            if (array[i].contains("te"))
            System.out.println("Yes");
        else
            System.out.println("No");
        }
    }
//todo histogram


