package com.app.library_management.domain.dto;

import com.app.library_management.domain.vo.BookVO;
import com.app.library_management.domain.vo.UserVO;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String userName;
    private String userIdentification;
    private String userPassword;
    private String userRegisterDate;

    @Builder
    public UserDTO(UserVO userVO) {
        this.id = userVO.getId();
        this.userName = userVO.getUserName();
        this.userIdentification = userVO.getUserIdentification();
    }
}
