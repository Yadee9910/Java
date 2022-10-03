import java.util.Scanner;
public class Question03{
    public static void main(String[]ags){
        Scanner a=new Scanner(System.in);
        System.out.print ("Enter your name :");
        String name= a.nextLine();
        System.out.print ("Enter your age :");
       
        int age =a.nextInt();
        System.out.println(name +""+ " your age is " +age);
    }
}