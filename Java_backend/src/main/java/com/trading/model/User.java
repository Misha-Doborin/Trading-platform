package main.java.com.trading.model;

public class User {
    private String username;
    public String email;
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
    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean authentication(String email,  String password, String username ) {
        return email.equals(this.email) && password.equals(this.password) && username.equals(this.username);
    }
}
