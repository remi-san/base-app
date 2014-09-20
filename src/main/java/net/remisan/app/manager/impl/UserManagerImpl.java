package net.remisan.app.manager.impl;

import net.remisan.app.manager.UserManager;
import net.remisan.app.model.User;
import net.remisan.app.repository.UserRepository;
import net.remisan.base.manager.AbstractManager;
import net.remisan.base.repository.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManagerImpl
    extends AbstractManager<User>
    implements UserManager {

    @Autowired
    private UserRepository repository;
    
    public UserManagerImpl() {
        super();
    }
    
    public UserManagerImpl(UserRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    protected Repository<User> getRepository() {
        return this.repository;
    }
}