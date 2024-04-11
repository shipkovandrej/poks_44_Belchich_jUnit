import java.util.regex.Pattern;

public class User {
    private String login;
    private String email;

    // Регулярное выражение для проверки электронной почты
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");

    public User(String login, String email){
        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException();
        }

        if (login.length() < 5) {
            throw new IllegalArgumentException();
        }

        this.login = login;
        this.email = email;
    }


    public User() {
        throw new IllegalArgumentException();
    }


    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
