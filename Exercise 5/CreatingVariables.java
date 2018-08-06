public class CreatingVariables {

    public static void main(String[] args) {

        int x, y, z, age;

        double seconds, e, checking, savings;

        String firstname, lastname, title, middlename, secondlastname;

        x = 10;

        y = 400;

        z = 1000;

        age = 39;

        seconds = 4.71;

        e = 2.71828182845904523536;

        checking = 1.89;

        savings = 10.08;

        secondlastname = "Jones";

        firstname = "Graham";

        lastname = "Mitchell";

        middlename = "Richard";

        title = "Mr.";

        System.out.println( "The variable x contains " + x + "." + " And the variable z contains " + z + ".");

        System.out.println( "The value " + y + " is stored in the variable y." );

        System.out.println( "The experiment took " + seconds + " seconds." );

        System.out.println( "A favorite irrational # is Euler's number: " + e );

        System.out.println( "Hopefully you have more than $" + checking + "!" );

        System.out.println( "Oh wait, you have like $" + savings + " in your savings though.");

        System.out.println( "My name's " + title + " " + firstname + " " + middlename + " " + lastname + " " + secondlastname);

    }
}

The Powershell Output 

PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 5> javac .\CreatingVariables.java
PS E:\Programming\Melton\Java\Summer Assingment 2018\Exercise 5> java CreatingVariables
The variable x contains 10. And the variable z contains 1000.
The value 400 is stored in the variable y.
The experiment took 4.71 seconds.
A favorite irrational # is Euler's number: 2.718281828459045
Hopefully you have more than $1.89!
Oh wait, you have like $10.08 in your savings though.
My name's Mr. Graham Richard Mitchell Jones
