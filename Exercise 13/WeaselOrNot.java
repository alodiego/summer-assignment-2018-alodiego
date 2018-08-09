import java.util.Scanner;

public class WeaselOrNot {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String word;

        boolean yep, nope;

        System.out.println( " Type the word \"weasel\", please." );

        word = keyboard.next();

        // Code still works when the positions of, "weasel", and word are switched

        yep = "weasel".equals(word);

        nope = ! word.equals("weasel");

        System.out.println( "You typed what was requested: " + yep );

        System.out.println( "You ignored polite instructions: " + nope );

    }
}

The Powershell Output 

PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 13> javac .\WeaselOrNot.java
PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 13> java WeaselOrNot
 Type the word "weasel", please.
weasel
You typed what was requested: true
You ignored polite instructions: false
