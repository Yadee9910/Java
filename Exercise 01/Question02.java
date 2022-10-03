import java.util.Scanner;
public class Question02{
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name= sc.nextLine();
        System.out.println("Hello," +name+ " have a nice day");
    }
}