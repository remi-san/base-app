package net.remisan.app.repository.impl;

import net.remisan.app.model.User;
import net.remisan.app.model.impl.HibernateUser;
import net.remisan.app.repository.UserRepository;
import net.remisan.base.repository.HibernateRepository;

import org.springframework.stereotype.Repository;

@Repository
public class UserHibernateRepository
    extends HibernateRepository<User>
    implements UserRepository {

    public UserHibernateRepository() {
        super(HibernateUser.class);
    }
}
