public class HelloWorld {
    public static void main(String[] args) {
        String name = "World";   // default value

        if (args.length > 0) {
            name = args[0];
        }

        System.out.println("Hello " + name);
    }
}