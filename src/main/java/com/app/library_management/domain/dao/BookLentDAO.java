package com.app.library_management.domain.dao;

import com.app.library_management.domain.dto.BookLentDTO;
import com.app.library_management.domain.vo.BookLentVO;
import com.app.library_management.mapper.BookLentMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BookLentDAO {
    private final BookLentMapper bookLentMapper;

    /* 도서대여 신청 */
    public void bookLentRegister(BookLentDTO bookLentDTO) {
        bookLentMapper.insertBookLent(new BookLentVO(bookLentDTO));
    }

    /* 도서반납 신청 */
    public void deleteForReturn(Long userId, Long bookId) {
        bookLentMapper.deleteForReturn(userId, bookId);
    }
}
