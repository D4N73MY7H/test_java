public class hello_world {
    public static void main(String[] args) {
        String name = "TEST";
        String lname = "KKK";
        System.out.println(name.concat(lname));
        System.out.println(Math.max(20, 100));

        printOddNumbers();
    }

    public static void printOddNumbers() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}