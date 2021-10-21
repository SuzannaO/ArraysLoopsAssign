public class String2 {
    public static void main(String[] args) {
        String sentence = "Climb mountains not so the world can see you, but so you can see the world";
        String[] words = sentence.split(" ");
        System.out.println("Number of words in the sentence is: " + words.length);


        int count = 0;
        for (int i = 0; i < words.length; i++)
            if (words[i].equals("the"))
                count++;
        System.out.println("There are " + count + " words 'the' in the sentence");

        int counter = 0;
        for (int i = 0; i < words.length; i++)
            if (words[i].contains("s"))
                counter++;
        System.out.println(counter + " words contains letter 's'");

        for (int i = 0; i < words.length; i++) {
            int count1 = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    if (j < i) {
                        break;
                    }
                    count1++;
                }
            }
            if (count1 > 1) {
                System.out.println("The word " + words[i] + " occured " + count1 + " time");
                // couldn't take words[i] into "", e.g. in terminal would be The word "the" occured 2 times
            }
        }

        String replaceString = sentence.replace("you", "You");
        System.out.println(replaceString);
    }
}
