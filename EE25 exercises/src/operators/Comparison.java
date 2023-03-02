package operators;

public class Comparison {
    public static void main(String[] args) {
        int i = 8, j = 8;
        System.out.println(i == j);
        System.out.println(i != j);
        System.out.println(i < 24);
        System.out.println(j != 5);
        System.out.println(i >= 8);

        int fiveValue = 5;
        Integer fiveObject = 5;
        Integer fiveObjectByNew = new Integer(5);
        Integer anotherFiveObjectByNew = new Integer(5);

        System.out.println(fiveValue == fiveObject);
        System.out.println(fiveValue == fiveObjectByNew);
        System.out.println(fiveObject == fiveObjectByNew);
        System.out.println(fiveObjectByNew == anotherFiveObjectByNew);

        System.out.println(fiveObject.equals(fiveObjectByNew));
        System.out.println(fiveObject.equals(anotherFiveObjectByNew));
        System.out.println(fiveObjectByNew.equals(anotherFiveObjectByNew));

        int twoHundredValue = 200;
        Integer twoHundredObject = 200;
        System.out.println(twoHundredValue == twoHundredObject);

/*        int i = 8, j = 8;
        Integer k = new Integer(8);
        Integer l = new Integer(8);
        System.out.println(i == j);
        System.out.println(k.equals(l));
        System.out.println(l.equals(j));
        */

    }
}
