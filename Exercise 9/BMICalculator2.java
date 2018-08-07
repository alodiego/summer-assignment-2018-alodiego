import java.util.Scanner;

public class BMICalculator2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double inches, feet, m, lbs, kg, bmi;

        System.out.print( "Your height (feet only): " );

        feet = keyboard.nextDouble();

        System.out.print( "Your height (inches): " );

        inches = keyboard.nextDouble();

        m = (inches * 0.0254) + (feet * 0.3048);

        System.out.print( "Your weight in lbs: " );

        lbs = keyboard.nextDouble();

        kg = lbs * 0.454;

        bmi = kg / (m*m);

        System.out.println( "Your BMI is " + bmi);

    }
}

The Powershell Output 

PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 9> javac .\BMICalculator2.java
PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 9> java BMICalculator2
Your height (feet only): 5
Your height (inches): 9.5
Your weight in lbs: 152
Your BMI is 22.144322535112643
