package mikkiice.pp311r.dao;


import mikkiice.pp311r.model.User;

import java.util.List;

public interface UserDao {
    void create(User user);
    User read(Long id);
    List<User> readAll();
    void update(User user);
    void delete(Long id);
}
