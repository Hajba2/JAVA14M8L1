public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //int a1, b1, b2, b3;
        int a1 = 1;
        int a2;

        a(1, 4, 7, 3);
        int[] arr = {1, 4, 5, 34, 5};
        a(arr);

    }

    public static void a(int... a) {
        for (int aElement : a) {
            System.out.println(aElement);
        }
    }
}