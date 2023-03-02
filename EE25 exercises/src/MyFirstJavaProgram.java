import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MyFirstJavaProgram {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello, Java!");// prints on different lines
       System.out.print("Hello world! "); //prints on same line
        System.out.println(); //prints empty line

       System.out.print("Hello, Java!".length()); //returns the length of the String
       String text = "Alice has a cat, and a cat has Alice!";
       System.out.println(text.substring(13, 25)); //returns parts of the String

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

    }

    public static class Loops {
        public static void main(String[] args) {
            //List numbers from -20 to 20 using a loop
            // write out first 6 numbers
            int count = 0;
            for (int i = -20; i <=20 ; i++) {
                System.out.println(i);
                count++;
                if (count == 6){
                    break;
                }

            }
        }
    }

    public static class Logical {
        public static void main(String[] args) {
            int a = 10;
            int b = 6;

            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
            System.out.println(a%b);
        }
    }
}
