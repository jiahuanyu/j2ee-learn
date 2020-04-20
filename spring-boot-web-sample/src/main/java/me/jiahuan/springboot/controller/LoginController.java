package me.jiahuan.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    //    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @PostMapping("/user/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            HttpServletRequest request
    ) {
        if (!StringUtils.isEmpty(username) && "1234".equals(password)) {
            request.getSession().setAttribute("loginUser", "admin");
            return "redirect:/dashboard";
        } else {
            return "redirect:/login";
        }
    }
}
