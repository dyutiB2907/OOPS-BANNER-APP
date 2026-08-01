import java.util.*;
public class vipcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        String id = sc.nextLine().trim();


        if (id.isEmpty()) {
            System.out.println("No input");
            return;
        }
        if (id.toUpperCase().startsWith("VIP")) {
            System.out.println("VIP");
        } else {
            System.out.println("Normal customer");
        }
    }
}