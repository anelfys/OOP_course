package Lab7.task4;

public class UserAccount {

    private String username;
    private String password;

    public UserAccount (String username, String password){

        this.username = username;
        this.password = password;
    }

    public boolean login(String enteredPassword){
        return this.password.equals(enteredPassword) ;
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
}
