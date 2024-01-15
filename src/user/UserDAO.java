package user;

public class UserDAO implements UserDAOInterface{
    private static final User[] users;

    static {
        users = new User[]{
                new User("John Doe"),
                new User("Jamila"),
                new User("Peter"),
                new User("Claudia"),
        };
    }

    @Override
    public User[] getUsers() {
        return users;
    }


//    public static User[] getUsers() {
//        return users;
//    }
}
