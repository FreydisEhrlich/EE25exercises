public class ArrayLoop {
    public static void main(String[] args) {
        String[] seasons = {"Spring", "Summer", "Fall", "Winter"};
        int[] numbers = {34, 23, 89, 14, 63, 2, 55};

        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        for (String season : seasons) {
            System.out.println(season);
        }
    }
}
