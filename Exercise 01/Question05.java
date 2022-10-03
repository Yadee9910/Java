import java.util.Scanner;
public class Question05{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in); 
        System.out.print("Enter an item name :");
        String name = sc.nextLine();
        System.out.print("Enter an item price :");
        double price = sc.nextDouble();
        System.out.print("Enter the number of items :");
        int items = sc.nextInt();
        System.out.println("The total price of the " +name+ " is Rs " +(items*price));


}
}
