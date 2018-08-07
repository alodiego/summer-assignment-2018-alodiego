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
