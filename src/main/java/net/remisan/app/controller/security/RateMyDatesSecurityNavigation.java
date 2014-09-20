package net.remisan.app.controller.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import net.remisan.security.controllers.security.SecurityNavigation;
import net.remisan.security.form.BaseInscriptionForm;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RateMyDatesSecurityNavigation extends SecurityNavigation {
    
    @RequestMapping(value = "/subscribe.html", method = RequestMethod.POST)
    public ModelAndView inscriptionValidation(
        @ModelAttribute(value = "user") @Valid BaseInscriptionForm user,
        BindingResult result,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws BindException, InstantiationException, IllegalAccessException {
        return super.inscriptionValidation(user, result, request, response);
    }
    
}
