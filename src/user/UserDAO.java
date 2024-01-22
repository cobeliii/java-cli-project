package user;

import java.util.ArrayList;
import java.util.List;

public class UserDAO implements UserDAOInterface{
    private static final List<User> users;

    static {
        users = new ArrayList<>();
                users.add(new User("John Doe"));
                users.add(new User("Jamila"));
                users.add(new User("Peter"));
                users.add(new User("Claudia"));
    }

    @Override
    public List<User> getUsers() {
        return users;
    }


//    public static User[] getUsers() {
//        return users;
//    }
}
