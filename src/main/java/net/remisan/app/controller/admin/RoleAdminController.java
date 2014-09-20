package net.remisan.app.controller.admin;

import net.remisan.app.data.form.RoleForm;
import net.remisan.base.controller.CrudController;
import net.remisan.security.model.SecurityRole;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin/role", headers = "Accept=text/html")
public class RoleAdminController extends CrudController<SecurityRole, RoleForm> {
    
    public RoleAdminController() {
        this.alias = "role";
        this.requestBasePath = "admin";
        this.viewBasePath = "admin/";
    }
}
