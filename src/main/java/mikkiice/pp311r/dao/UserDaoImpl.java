package mikkiice.pp311r.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import mikkiice.pp311r.model.User;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void create(User user) {
        em.persist(user);
    }

    @Override
    public User read(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> readAll() {
        return em.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void update(User user) {
        em.merge(user);
    }

    @Override
    public void delete(Long id) {
        em.remove(em.find(User.class, id));
    }
}
