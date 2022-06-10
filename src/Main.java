import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int grade;
        System.out.println("please enter your grade:");
        Scanner scanner=new Scanner(System.in);
        grade=scanner.nextInt();
        if (grade <=20) {
            System.out.println("fail");
        } else if (grade <= 60) {

            System.out.println("You need to Study");
        } else
        {
            System.out.println("pass");

        }












    }
}