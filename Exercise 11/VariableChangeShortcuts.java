public class VariableChangeShortcuts {

    public static void main(String[] args) {

        int i, j, k;

        i = 5;

        j = 5;

        k = 5;

        System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );

        i = i + 3;

        j = j - 3;

        k = k * 3;

        System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );

        i = 5;

        j = 5;

        k = 5;

        System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );

        i += 3;

        j -= 3;

        k *= 3;

        System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );

        i = j = k = 5;

        System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );

        i += 1;

        j -= 2;

        k *= 3;

        System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );

        i = j = 5;

        System.out.println( "i: " + i + "\tj: " + j );

        i =+ 1;

        j =- 2;

        System.out.println( "i: " + i + "\tj: " + j + "\n" );

        i = j = 5;

        System.out.println( "i: " + i + "\tj: " + j );

        i++;

        j--;

        System.out.println( "i: " + i + "\tj: " + j + "\n" );

        i = 5;

        System.out.println( "i: " + i );

        i -= 5;

        System.out.println( "i: " + i + "\n" );

        i = 5;

        System.out.println( "i: " + i );

        i++;
        i++;
        i++;
        i++;
        i++;

        System.out.println( "i: " + i );

    }
}

The Powershell Output 

PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 11> javac .\VariableChangeShortcuts.java
PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 11> java VariableChangeShortcuts
i: 5    j: 5    k: 5
i: 8    j: 2    k: 15

i: 5    j: 5    k: 5
i: 8    j: 2    k: 15

i: 5    j: 5    k: 5
i: 6    j: 3    k: 15

i: 5    j: 5
i: 1    j: -2

i: 5    j: 5
i: 6    j: 4

i: 5
i: 0

i: 5
i: 10
