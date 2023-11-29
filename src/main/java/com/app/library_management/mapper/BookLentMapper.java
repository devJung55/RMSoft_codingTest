package com.app.library_management.mapper;

import com.app.library_management.domain.vo.BookLentVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookLentMapper {
    /* 도서대여 신청 */
    public void insertBookLent(BookLentVO bookLentVO);

    /* 도서반납 신청 */
    public void deleteForReturn(Long userId, Long bookId);
}
