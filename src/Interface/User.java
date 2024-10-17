package Interface;

public class User {
    private String userName;
    private String password;
    private String email;
    private String role;
    public User(String userName,String password,String email,String role)
    {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public boolean logIn()
    {
        return true;
    }
}
