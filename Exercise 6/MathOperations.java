public class MathOperations {

    public static void main(String[] args) {

        int a, b, c, d, e, f, g;

        double x, y, z;

        String one, two, both;

        a = 10;

        b = 27;

        System.out.println( "a is " + a + ", b is " + b );

        c = a + b;

        System.out.println( "a+b is " + c);

        d = a - b;

        System.out.println( "a-b is " + d );

        e = a+b*3;

        System.out.println( "a+b*3 is " + e );

        f = b / 2;

        System.out.println( "b/2 is " + f );

        g = b % 10;

        System.out.println( "b%10 is " + g );

        x = 1.1;

        System.out.println( "\nx is " + x );

        y = x*x;

        System.out.println( "x*x is " + y );

        z = b / 2;

        System.out.println( "b/2 is " + z );

        System.out.println();

        one = "dog";

        two = "house";

        both = one + two;

        System.out.println( both );

    }
}

The Powershell Output 

PS C:\Users\tatom\Desktop\src\com\company> java MathOperations
a is 10, b is 27
a+b is 37
a-b is -17
a+b*3 is 91
b/2 is 13
b%10 is 7

x is 1.1
x*x is 1.2100000000000002
b/2 is 13.0

doghouse
