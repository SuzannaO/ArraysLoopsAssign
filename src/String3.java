public class String3 {
    public static void main(String[] args) {
        String name = "John";
        if (name.matches("[a-zA-Z]+")) {
            System.out.println("The name is John");
        } else {
            System.out.println("Invalid parameter");
        }

        String surname = "s20surname";
        if (surname.matches("[a-zA-Z]{1}[0-9]{2}[a-zA-Z]+")) {
            System.out.println("Surname accepted");
        } else {
            System.out.println("Invalid parameter");

        }
        String personCodeOfLatvian = "121200-11311";
        if (personCodeOfLatvian.matches("[0-9]{6}[-]{1}[0-9]{5}")) {
            System.out.println("Code is correct");
        } else {
            System.out.println("Invalid parameter");
        }
    }
}