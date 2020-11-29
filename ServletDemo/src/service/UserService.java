package service;

import dao.UserDao;

public class UserService {
    UserDao userDao = new UserDao();

    public boolean selectUserByNameAndPassword(String name, String password) throws Exception {
        return userDao.selectUserByNameAndPassword(name, password);
    }
}
