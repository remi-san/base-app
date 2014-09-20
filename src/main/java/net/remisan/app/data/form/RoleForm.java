package net.remisan.app.data.form;

import javax.validation.constraints.NotNull;

import net.remisan.app.model.impl.HibernateRole;
import net.remisan.base.app.form.AbstractPersistableEntityForm;
import net.remisan.security.model.SecurityRole;

import org.hibernate.validator.constraints.NotEmpty;

public class RoleForm extends AbstractPersistableEntityForm<SecurityRole> {

    protected Long id;

    @NotNull
    @NotEmpty
    protected String name;

    public RoleForm() {
        super(HibernateRole.class);
    }
    
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}