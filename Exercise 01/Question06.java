import java.util.Scanner;
public class Question06{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Celsius value :- ");
        float celsius =sc.nextFloat();
        float Fahrenheit = (9*(celsius/5)) +32;
        System.out.print("The Fahrenheit value is :- " +Fahrenheit);


    }
}