public class User {
    private String username;
    private String password;
    private String filePath;

    public User(String username, String password, String filePath) {
        this.username = username;
        this.password = password;
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
