import java.util.Scanner;
import java.util.regex.*;

public class SistemMembership_BarbieDreamroom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String id, username, email;

        System.out.println("=== Barbie Dream-Room Membership ===");

        System.out.print("Masukkan ID Member: ");
        id = input.nextLine();

        System.out.print("Masukkan Username: ");
        username = input.nextLine();

        System.out.print("Masukkan Email: ");
        email = input.nextLine();

        // Validasi ID
        if (id.matches("^BRB-[0-9]{4}$")) {
            System.out.println("ID Member VALID");
        } else {
            System.out.println("ID Member TIDAK VALID (Format: BRB-XXXX)");
        }

        // Validasi Username
        if (username.matches("^[a-zA-Z0-9_]{5,15}$")) {
            System.out.println("Username VALID");
        } else {
            System.out.println("Username TIDAK VALID (5-15 karakter, tanpa spasi)");
        }

        // Validasi Email
        if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}$")) {
            System.out.println("Email VALID");
             System.out.println("=== Selamat Bergabung di Barbie Dream-Room ===");
        } else {
            System.out.println("Email TIDAK VALID");
        }
       
    } 
}