/* Program to print whether a number is even or odd */
import java.util.Scanner;
class evenOddNumber {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number+"Even Number");
        } else {
            System.out.println(number+"Odd Number");            
        }
    }
}