package net.remisan.app.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import net.remisan.app.model.impl.HibernateRole;
import net.remisan.base.repository.HibernateRepository;
import net.remisan.security.model.SecurityRole;
import net.remisan.security.repository.SecurityRoleRepository;

import org.springframework.stereotype.Repository;

@Repository
public class SecurityRoleHibernateRepository
    extends HibernateRepository<SecurityRole>
    implements SecurityRoleRepository {

    public SecurityRoleHibernateRepository() {
        super(HibernateRole.class);
    }
    
    @SuppressWarnings("unchecked")
    public SecurityRole getByName(String alias) {
        List<SecurityRole> roleList = new ArrayList<SecurityRole>();
        Query query = entityManager.createQuery("from " + className + " r where r.name = :name");
        query.setParameter("name", alias);
        roleList = query.getResultList();
        if (roleList.size() > 0) {
            return roleList.get(0);
        } else {
            return null;
        }
    }
}
