package com.app.library_management.domain.dao;

import com.app.library_management.domain.dto.UserDTO;
import com.app.library_management.domain.vo.UserVO;
import com.app.library_management.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;

    /* 회원가입 */
    public void register(UserDTO userDTO) {
        userMapper.insertUser(new UserVO(userDTO));
    }

    /* 아이디 중복검사 */
    public Long checkByIdentification(String userIdentification) {
        return userMapper.selectByIdentification(userIdentification);
    }

    /* 로그인 */
    public Long login(UserVO userVO) {
        return userMapper.selectByUserIdAndUserPassword(userVO);
    }
}



