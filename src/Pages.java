import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi, please enter your age");
        int age = Integer.parseInt(scan.nextLine());
        int pages = 100 - age;
        System.out.println(age + " year olds should read at least " + pages + " pages before giving up on a book.");
    }
}

