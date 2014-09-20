package net.remisan.app.model.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import net.remisan.app.model.Role;

@Entity
@Table(name = "roles", schema = "credentials")
public class HibernateRole implements Role {

    private static final long serialVersionUID = 6323919105131647694L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    @Column(name = "role_name")
    @NotNull
    private String name;

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

    @Override
    public String toString() {
        return "[" + this.id + "] : " + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Role)) {
            return false;
        }

        Role other = (Role) obj;

        return this.getId() == other.getId()
                && this.getName() == other.getName();
    }
    
    public boolean isNew() {
        return this.id == null;
    }

}
