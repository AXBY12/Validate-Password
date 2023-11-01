import java.util.regex.*;

public class PasswordValidator {

    public static boolean validatePassword(String password) {
        if (password.length() < 8 || password.length() > 16) {
            return false;
        }

        int categories = 0;

        
        if (Pattern.compile("[a-z]").matcher(password).find()) {
            categories++;
        }

        
        if (Pattern.compile("[A-Z]").matcher(password).find()) {
            categories++;
        }

        
        if (Pattern.compile("[0-9]").matcher(password).find()) {
            categories++;
        }

        
        if (Pattern.compile("[~!@#\\$%^&*\\(\\)-=+_]").matcher(password).find()) {
            categories++;
        }

        return categories >= 3;
    }

    public static void main(String[] args) {
        String password = "P@ssw0rd";
        if (validatePassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid.");
        }
    }
}

