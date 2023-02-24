public class ConditionalStatementsDice {
    public static void main(String[] args) {
        int result = (int) (Math.random() * 6 + 1); //simulates roll of a dice
        System.out.println(result);

        if (result == 1 || result == 3 || result == 5) {
            System.out.println("Odd");
        } else if (result == 2 || result == 4) {
            System.out.println("Even");
        } else if (result == 6) {
            System.out.println("Even \n" + "WON");
        } else {
            System.out.println("Error or the dice has landed on the edge!");
        }
    }
}
