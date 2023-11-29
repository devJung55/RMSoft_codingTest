package com.app.library_management.controller;

import com.app.library_management.domain.dto.UserDTO;
import com.app.library_management.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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

    /* 아이디로 회원정보 찾기 */
    @PostMapping("searchUserInfo")
    public UserDTO searchUserInfo(@RequestParam("userId") String userId) {
        return userService.selectByUserIdentification(Long.parseLong(userId));
    }
}
