import java.util.Scanner;

public class BMICalculator1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double inches, m, lbs, kg, bmi;

        System.out.print( "Your height in inches: " );

        inches = keyboard.nextDouble();

        m = inches * 0.0254;

        System.out.print( "Your weight in lbs: " );

        lbs = keyboard.nextDouble();

        kg = lbs * 0.454;

        bmi = kg / (m*m);

        System.out.println( "Your BMI is " + bmi);

    }
}

The Powershell Output 

PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 9> javac .\BMICalculator1.java
PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 9> java BMICalculator1
Your height in inches: 69.5
Your weight in lbs: 152
Your BMI is 22.144322535112646
