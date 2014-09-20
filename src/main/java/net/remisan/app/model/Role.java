package net.remisan.app.model;

import net.remisan.security.model.SecurityRole;

public interface Role extends SecurityRole {

    Long getId();

    void setId(Long id);

    String getName();

    void setName(String name);

}