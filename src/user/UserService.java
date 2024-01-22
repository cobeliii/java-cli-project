package user;

import java.util.List;

public class UserService {

    private final List<User> users;

    public UserService(UserDAO userDAO) {
        users = userDAO.getUsers();
    }

    public User getUser(String name){
        for (User user: users){
            if (name.equalsIgnoreCase(user.getName())){
                return user;
            }
        }

        return null;
    }

    public void viewAllUsers(){
        for (User user : users) {
            System.out.println(user);
        }
    }
}
