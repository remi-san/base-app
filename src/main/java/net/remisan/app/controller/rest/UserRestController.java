package net.remisan.app.controller.rest;

import net.remisan.app.model.impl.HibernateUser;
import net.remisan.base.controller.RestController;
import net.remisan.security.model.SecurityUser;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1/user")
public class UserRestController extends RestController<SecurityUser, HibernateUser> {

}
