public class OOPSBannerUC6 {

    public static void main(String[] args) {

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Since O appears twice in OOPS
        String[] O2 = buildO();

        // Loop to print banner line by line
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O2[i] + "  " + P[i] + "  " + S[i]);
        }
    }

    // Static Method for Letter O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static Method for Letter P
    public static String[] buildP() {
        return new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        };
    }

    // Static Method for Letter S
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }
}
