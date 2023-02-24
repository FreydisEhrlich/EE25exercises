import java.util.Arrays;
public class Array {


    public static void main(String[] args) {

        int[] numbers = new int[5];
        int[] luckyNumbers = {1, 3, 7, 17, 21};
        String[] names = new String[10];
        String[] seasons = {"Spring", "Summer", "Fall", "Winter"};

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(luckyNumbers));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(seasons));

        System.out.println(luckyNumbers);
        System.out.println(seasons);



        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(seasons));

        numbers[0] = 25;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);
        numbers[4] = -200;
        System.out.println(Arrays.toString(numbers));

        seasons[1] = "";
        seasons[2] = null;
        System.out.println(Arrays.toString(seasons));
        System.out.println(seasons[3]);


        System.out.println(numbers.length);
        System.out.println(seasons.length-1);//the index of last element
    }

}
