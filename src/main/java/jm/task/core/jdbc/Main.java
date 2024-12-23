package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {

    public final static UserService userService = new UserServiceImpl();
    public final static User user1 = new User("Goku", "Son", (byte) 43);
    public final static User user2 = new User("Piccolo", "Daimao", (byte) 34);
    public final static User user3 = new User("Jotaro", "Kyjo", (byte) 17);
    public final static User user4 = new User("Giorno", "Giovanna", (byte) 15);

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user.toString());
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();

        Util.closeSessionFactory();
//        Util.closeConnection();
    }
}
