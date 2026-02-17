/**
 * OOPSBannerApp
 * UC3: Refactor banner using String.join() for better memory efficiency
 * 
 * @author sanchayan76
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join("   ",
                " *** ",
                " *** ",
                " *** ",
                " *** "));

        System.out.println(String.join("   ",
                "*     *",
                "*     *",
                "*     *",
                "*     *"));

        System.out.println(String.join("   ",
                "*     *",
                "*     *",
                "*     *",
                "*     *"));

        System.out.println(String.join("   ",
                "*     *",
                " *** ",
                " *** ",
                " *** "));

        System.out.println(String.join("   ",
                "*     *",
                "*",
                "*",
                "*"));

        System.out.println(String.join("   ",
                "*     *",
                "*",
                "*",
                "*"));

        System.out.println(String.join("   ",
                " *** ",
                "*",
                " *** ",
                "*"));
    }
}
