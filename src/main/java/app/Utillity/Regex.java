package app.Utillity;

public interface Regex {
    String LOGIN = "^[A-Z][a-z]{1,20}$";
    String PASSWORD = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).*$";
}
