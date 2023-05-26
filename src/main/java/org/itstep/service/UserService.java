package org.itstep.service;

import org.itstep.dao.impl.PostDao;
import org.itstep.dao.impl.UserDao;
import org.itstep.dao.impl.UserDaoImpl;
import org.itstep.data.User;

public class UserService {
    protected UserDao userDao;
    public UserService() {
        this.userDao = new UserDaoImpl();
    }

    public User findUserByLoginAndPassword (String login, String password){
        return userDao.selectByLoginAndPassword(login, password);
    }

    public User findUserById(int authorIdDB) {
        return userDao.selectById(authorIdDB);
    }
}
