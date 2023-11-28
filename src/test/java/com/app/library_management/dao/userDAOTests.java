package com.app.library_management.dao;

import com.app.library_management.domain.dao.UserDAO;
import com.app.library_management.domain.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class userDAOTests {
    @Autowired
    private UserDAO userDAO;

    /* 회원가입 */
    @Test
    public void userDAOTest() {
        UserDTO userDTO = new UserDTO();

        userDTO.setUserIdentification("정지영");
        userDTO.setUserPassword("1234");

        userDAO.register(userDTO);
    }
}
