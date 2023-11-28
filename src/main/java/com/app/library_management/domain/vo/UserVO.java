package com.app.library_management.domain.vo;

import com.app.library_management.domain.dto.UserDTO;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class UserVO {
    private Long id;
    private String userIdentification;
    private String userPassword;
    private String userRegisterDate;

    @Builder
    public UserVO(UserDTO userDTO) {
        this.userIdentification = userDTO.getUserIdentification();
        this.userPassword = userDTO.getUserPassword();
    }
}
