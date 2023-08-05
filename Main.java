//********************************************************************
//  Main.java
//  Print up to the Nth line of Pascal’s Triangle
//********************************************************************
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //prompt user to enter the Pascal's Triangle row
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row");
        int num = scan.nextInt();
        //paste the value and instantiates a triangle object
        new triangle(num);
    }
}