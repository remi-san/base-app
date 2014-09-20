package net.remisan.app.repository.impl;

import java.util.List;

import javax.persistence.Query;

import net.remisan.app.model.impl.HibernateUser;
import net.remisan.base.repository.HibernateRepository;
import net.remisan.security.model.SecurityUser;
import net.remisan.security.repository.SecurityUserRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

@Repository
public class SecurityUserHibernateRepository
    extends HibernateRepository<SecurityUser>
    implements SecurityUserRepository {
    
    public SecurityUserHibernateRepository() {
        super(HibernateUser.class);
    }
    
    public SecurityUser getByLogin(String login) {
        Query query = this.entityManager.createQuery("from " + className + " u where u.login = :login");
        query.setParameter("login", login);
        return this.getOne(query);    
    }

    public SecurityUser getByActivationToken(String token) {
        Query query = this.entityManager.createQuery("from " + className + " u where u.activationToken = :token");
        query.setParameter("token", token);
        return this.getOne(query);
    }
    
    public SecurityUser getByEmail(String email) {
        Query query = this.entityManager.createQuery("from " + this.className + " u where u.email = :email");
        query.setParameter("email", email);
        return this.getOne(query);
    }
    
    @SuppressWarnings("unchecked")
    protected SecurityUser getOne(Query query) {
        List<SecurityUser> userList = query.getResultList();
        if (userList.size() > 0) {
            return userList.get(0);
        } else {
            return null;    
        }
    }
    
    public SecurityUser getPersistable(SecurityUser user) throws InstantiationException, IllegalAccessException {
        
        if (user instanceof HibernateUser) {
            return user;
        }
        
        SecurityUser persistable = null;
        
        // Get persistable user
        if (user.getId() != null) {
            persistable = this.findOne(user.getId());
        } else {
            persistable = this.getNewInstance();
        }
        
        BeanUtils.copyProperties(user, persistable);
        
        return persistable;
    }
}
