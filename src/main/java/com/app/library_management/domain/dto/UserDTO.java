package com.app.library_management.domain.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserDTO {
    private Long id;
    private String userIdentification;
    private String userPassword;
    private String userRegisterDate;
}
