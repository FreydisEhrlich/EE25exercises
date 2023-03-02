package operators;

public class Operators {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x++);
        System.out.println(++x);//does not take into account the x = 5, but the previous line
        System.out.println(--x);
        System.out.println(x--);

        int a = 10;
        int b = 6;

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(b--);
        System.out.println(--b);
    }
}
