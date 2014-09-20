package net.remisan.app.service.impl;

import net.remisan.app.manager.UserManager;
import net.remisan.app.model.User;
import net.remisan.app.service.UserService;
import net.remisan.base.manager.Manager;
import net.remisan.base.service.AbstractService;
import net.remisan.security.util.UserUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindException;

@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {

    @Autowired
    private UserManager manager;
    
    @Autowired
    private UserUtil userUtil;

    @Override
    protected Manager<User> getManager() {
        return this.manager;
    }

    public void setManager(UserManager manager) {
        this.manager = manager;
    }
    
    @Override
    public User save(User user) throws BindException {

        this.userUtil.preSave(user);
        boolean isNew = user.isNew();

        User u = this.manager.save(user);
        
        if (isNew) {
            this.userUtil.postSave(u, true);
        }

        return u;
    }
}
