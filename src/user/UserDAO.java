package user;

public class UserDAO {
    private static final User[] users;

    static {
        users = new User[]{
                new User("John Doe"),
                new User("Jamila"),
                new User("Peter"),
                new User("Claudia"),
        };
    }

    public static User[] getUsers() {
        return users;
    }
}
