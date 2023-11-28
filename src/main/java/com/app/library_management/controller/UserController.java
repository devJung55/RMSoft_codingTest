package com.app.library_management.controller;

import com.app.library_management.domain.dto.UserDTO;
import com.app.library_management.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user/*")
@Slf4j
public class UserController {
    private final UserService userService;

    /* 회원가입 */
    @GetMapping("join")
    public void join(Model model) {
        model.addAttribute(new UserDTO());
    }

    @PostMapping("join")
    public RedirectView join(UserDTO userDTO) {
        userService.join(userDTO);
        return new RedirectView("/main");
    }

    /* 로그인 */
    @GetMapping("login")
    public void login(Model model) {
        model.addAttribute(new UserDTO());
    }

    /* 로그인 */
    @PostMapping("login")
    public RedirectView login(UserDTO userDTO) {
        Long userId = userService.login(userDTO);

        if(userId == null) {
            return new RedirectView("/user/login?check=false");
        }
        return new RedirectView("/main");
    }
}
