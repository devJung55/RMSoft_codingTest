package com.app.library_management.controller;

import com.app.library_management.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users/*")
@Slf4j
public class UserRestController {
    private final UserService userService;

    /* 아이디 중복검사 */
    @PostMapping("checkIdentification")
    public Long checkIdentification(@RequestParam("userIdentification") String userIdentification) {
        return userService.checkByIdentification(userIdentification);
    }
}
