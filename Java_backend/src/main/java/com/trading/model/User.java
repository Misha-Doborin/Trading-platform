package main.java.com.trading.model;

public class User {
    private String username;
    private String email;
    private String password;
    private String balance;
    public String getBalance() {
        return balance;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }
    public String getEmail() {
        return this.email;
    }
    public String getUsername() {
        return this.username;
    }
    protected void setUsername(String username) {
        this.username = username;
    }
    protected void setEmail(String email) {
        this.email = email;
    }
    protected void setPassword(String password) {
        this.password = password;
    }
    protected String getPassword() {
        return this.password;
    }
    public boolean authentication(String email,  String password, String username ) {
        return email.equals(this.email) && password.equals(this.password) && username.equals(this.username);
    }

    public boolean isDontRegister(User user) {
        return user.getUsername() == null && user.getEmail() == null && user.getPassword() == null;
    }
    public boolean isRegistered(User user) {
        return user.getUsername() != null && user.getEmail() != null && user.getPassword() != null;
    }
}
