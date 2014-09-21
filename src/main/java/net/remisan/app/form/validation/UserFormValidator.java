package net.remisan.app.form.validation;

import net.remisan.app.data.form.UserForm;
import net.remisan.base.model.validation.util.UserValidationHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserFormValidator implements Validator {

    @Autowired
    private UserValidationHelper userValidationHelper;

    @Override
    public boolean supports(Class<?> clazz) {
        return UserForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        UserForm user = (UserForm) obj;
        this.userValidationHelper.validateEmail(errors, user.getId(), user.getEmail());
        this.userValidationHelper.validateLogin(errors, user.getId(), user.getLogin());
    }
}