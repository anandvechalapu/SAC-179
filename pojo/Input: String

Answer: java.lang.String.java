User Story:
As a user, I want to be able to create an account so that I can access certain features on the website. 

public class Account {
    private String username;
    private String password;
    private boolean isActive;
    
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.isActive = false;
    }

    public boolean createAccount() {
        if (username == null || password == null) {
            return false;
        }
        
        this.isActive = true;
        return true;
    }
    
    public boolean validateCredentials(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            return true;
        }
        
        return false;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public boolean isActive() {
        return isActive;
    }
}