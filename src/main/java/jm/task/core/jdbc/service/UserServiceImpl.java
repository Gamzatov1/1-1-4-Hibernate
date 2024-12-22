package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDaoHibernateImpl udhi = new UserDaoHibernateImpl();

    @Override
    public void createUsersTable() {
        udhi.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        udhi.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        udhi.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        udhi.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return udhi.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        udhi.cleanUsersTable();
    }
}
