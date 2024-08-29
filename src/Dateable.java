import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Please type in you name");
        int age = -1;
        while (age < 0) {
            System.out.println("enter a valid number.");
            try {
                age = Integer.parseInt(scan.nextLine());
            }
            catch(NumberFormatException e) {
            }

        int dating  = age / 2 + 7;
    System.out.println(age + " year olds should date someone who is at least " + dating + " years old.");
    }
    }
}

