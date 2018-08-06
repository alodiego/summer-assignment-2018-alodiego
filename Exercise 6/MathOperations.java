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

        System.out.println();

        double h, w;

        h = (f*g) - x;

        w = (b+a) / z;

        System.out.println( "(f*g) / x is " + h );

        System.out.println();

        System.out.println( "(b+a) - z is " + w );

        System.out.println();

    }
}

The Powershell Output 

PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 6> javac .\MathOperations.java
PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 6> java MathOperations
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

(f*g) / x is 89.9

(b+a) - z is 2.8461538461538463
