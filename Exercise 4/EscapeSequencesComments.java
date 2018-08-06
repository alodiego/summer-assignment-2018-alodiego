public class EscapeSequencesComments {

    public static void main(String[] args) {

        System.out.print( "Learn\tJava\n\tthe\nHard\tWay\n\n" );

        System.out.print( "\tLearn Java the Hard \"Hard\" Way!\n" );

        // System.out.frimp( "Learn Java the Hard Way" );

        System.out.print( "Hello\n" ); // This line prints Hello.

        System.out.print( "Jello\by\n" ); // This line prints Jelly.

        /* The quick brown fox jumped over a lazy dog.
           Quick wafting zephyrs vex bold Jim. */

        System.out /* testing */ .println ( "Hard to believe, eh?" );

        System.out.println( "Surprised? /* abcde */ Or what did you expect?" );

        // Adding a block comment between "print" and "ln" does not compile

        System.out.println( "\\ // -=- \\ //" );

        System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); // it takes 2 to make 1

        System.out.print( "I hope you understand \"escape sequences\" now.\n" );

        // and comments
    }
}

The Powershell Output 

PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 4> java EscapeSequencesComments
Learn   Java
        the
Hard    Way

        Learn Java the Hard "Hard" Way!
Hello
Jelly
Hard to believe, eh?
Surprised? /* abcde */ Or what did you expect?
\ // -=- \ //
\\ \\\ \\\\
I hope you understand "escape sequences" now.
