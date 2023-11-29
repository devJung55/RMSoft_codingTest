package com.app.library_management.service;

import com.app.library_management.domain.dao.UserDAO;
import com.app.library_management.domain.dto.UserDTO;
import com.app.library_management.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDAO userDAO;

    /* 회원가입 */
    public void join(UserDTO userDTO) {
        userDAO.register(userDTO);
    }

    /* 아이디 중복검사 */
    public Long checkByIdentification(String userIdentification) {
        return userDAO.checkByIdentification(userIdentification);
    }

    /* 로그인 */
    public Long login(UserDTO userDTO) {
        return userDAO.login(new UserVO(userDTO));
    }

    /* 아이디로 회원정보 검색 */
    public UserDTO selectByUserIdentification(Long userId) {
        return userDAO.selectByUserIdentification(userId);
    }
}
