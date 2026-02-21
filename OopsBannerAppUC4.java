public class OopsBannerAppUC4 {

    public static void main(String[] args) {

        // Banner lines stored in String array
        String[] banner = {
                String.join(" ", "*   *", "*****", "*     *"),
                String.join(" ", "*   *", "*   *", "* *   *"),
                String.join(" ", "*****", "*****", "*  *  *"),
                String.join(" ", "*   *", "*   *", "*   * *"),
                String.join(" ", "*   *", "*****", "*     *")
        };

        // Printing banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}