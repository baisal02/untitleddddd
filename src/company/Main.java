package company;

import company.Enum.Gender;
import company.dao.UserDao;
import company.model.User;
import company.service.impl.UserServiceImpl;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "user 1", Gender.MALE);
        User user1 = new User(2, "user 2", Gender.MALE);
        User user2 = new User(3, "user 3", Gender.FEMALE);
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);

        UserDao userDao = new UserDao(users);
        UserServiceImpl userService = new UserServiceImpl(userDao);
        userService.findbyid(1);
        userService.deletewithid(2);
        userService.takeallusers();
        userService.findbyid(5);
    }
}