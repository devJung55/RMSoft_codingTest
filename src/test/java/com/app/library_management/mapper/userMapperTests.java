package com.app.library_management.mapper;

import com.app.library_management.domain.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class userMapperTests {
    @Autowired
    private UserMapper userMapper;

    /* 회원가입 */
    @Test
    public void insertUserTest() {
        UserVO userVO = new UserVO();

        userVO.setUserIdentification("정지영");
        userVO.setUserPassword("1234");

        userMapper.insertUser(userVO);
    }
}
