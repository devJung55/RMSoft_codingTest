package com.app.library_management.mapper;

import com.app.library_management.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserMapper {
    /* 회원가입 */
    public void insertUser(UserVO userVO);

    /* 아이디 중복검사 */
    public Long selectByIdentification(String userIdentification);

    /* 로그인 */
    public Long selectByUserIdAndUserPassword(UserVO userVO);

    /* 아이디로 회원정보 검색 */
    public UserVO selectByUserIdentification(Long userId);
}