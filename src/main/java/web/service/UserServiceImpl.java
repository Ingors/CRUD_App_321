package web.service;

import web.dao.UserDAO;
import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserDAO userDao;

    @Autowired
    public UserServiceImpl(UserDAO userDao) {

        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {

        return userDao.getAllUsers();
    }

    @Override
    public User getUser(int id) {
        return
                userDao.getUser(id);
    }

    @Transactional
    @Override
    public void createUser(User user) {

        userDao.createUser(user);
    }

    @Transactional
    @Override
    public void updateUser(User user)
    {
        userDao.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id); }
}