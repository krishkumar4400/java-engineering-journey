public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(Math.random());
        System.out.println(Math.min(13, 66));
        System.out.println(Math.max(13, 66));

        System.out.println("5 * 2 = 10");
        System.out.printf("5 * 2 = %d", 5 * 2).println();
        System.out.printf("%d * %d = %d", 5, 7, 5 * 7).println();
        // System.out.printf("%d + %d = %d", 10,20); // error
        System.out.printf("%d + %d = %d", 10, 20, 30, 40).println(); // no error
        System.out.printf("My name is %s", "krish").println();
        System.out.printf("%f is float", 11.945).println();
        System.out.println("5+5="+5+5);
        System.out.println("5+5 = " + 5+5);
    }
}