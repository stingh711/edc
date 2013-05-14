package com.unimedsci.edc.web.backend.controller.user;

import com.unimedsci.edc.core.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * @author: Sting
 * @created: 13-5-9 下午3:23
 */
@Controller
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLogin(Model model) {
        model.addAttribute(new User());
        return "user/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@Valid User user, BindingResult bindingResult) {
        logger.info(user.toString());
        if (bindingResult.hasErrors()) {
            logger.error(bindingResult.toString());
            return "user/login";
        }
        return "redirect:/member/list";
    }
}
