import java.util.Scanner;

public class Sequencing {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double price, salesTax, total;

        System.out.print( "How much is the purchase price? " );

        price = keyboard.nextDouble();

        salesTax = price * 0.0825;

        total = price + salesTax;

        System.out.println( "Item price:\t" + price);

        System.out.println( "Sales tax:\t" + salesTax);

        System.out.println( "Total cost:\t" + total);

    }
}

The Powershell Output 

PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 10> javac .\Sequencing.java
PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 10> java Sequencing
How much is the purchase price? 7.99
Item price:     7.99
Sales tax:      0.6591750000000001
Total cost:     8.649175
