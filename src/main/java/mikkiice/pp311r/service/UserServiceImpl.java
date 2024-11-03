package mikkiice.pp311r.service;

import jakarta.transaction.Transactional;
import mikkiice.pp311r.dao.UserDao;
import mikkiice.pp311r.model.User;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void createUser(User user) {
        userDao.create(user);
    }

    @Override
    public List<User> getUsers() {
        return userDao.readAll();
    }

    @Override
    @Transactional
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Override
    public User getUsers(Long id) {
        return userDao.read(id);
    }
}
