package net.remisan.app.controller.admin;

import net.remisan.app.data.form.UserForm;
import net.remisan.app.model.User;
import net.remisan.base.controller.CrudController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin/user", headers = "Accept=text/html")
public class UserAdminController extends CrudController<User, UserForm> {
    
    public UserAdminController() {
        this.alias = "user";
        this.requestBasePath = "admin";
        this.viewBasePath = "admin/";
    }
}
