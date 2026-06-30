import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter desired password length: ");
        int length = sc.nextInt();

        System.out.print("Include lowercase letters? (y/n): ");
        boolean useLower = sc.next().equalsIgnoreCase("y");

        System.out.print("Include uppercase letters? (y/n): ");
        boolean useUpper = sc.next().equalsIgnoreCase("y");

        System.out.print("Include numbers? (y/n): ");
        boolean useNumbers = sc.next().equalsIgnoreCase("y");

        System.out.print("Include special characters? (y/n): ");
        boolean useSpecial = sc.next().equalsIgnoreCase("y");

        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String special = "!@#$%^&*()-_=+[]{}";

        StringBuilder charPool = new StringBuilder();
        if (useLower) charPool.append(lower);
        if (useUpper) charPool.append(upper);
        if (useNumbers) charPool.append(numbers);
        if (useSpecial) charPool.append(special);

        if (charPool.length() == 0) {
            System.out.println("Error: You must select at least one character type.");
            sc.close();
            return;
        }

        if (length <= 0) {
            System.out.println("Error: Password length must be greater than 0.");
            sc.close();
            return;
        }

        String password = generatePassword(length, charPool.toString());

        System.out.println("\nGenerated Password: " + password);

        sc.close();
    }

    public static String generatePassword(int length, String charPool) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }

        return password.toString();
    }
}
