package com.app.library_management.domain.dao;

import com.app.library_management.domain.dto.BookDTO;
import com.app.library_management.domain.vo.BookVO;
import com.app.library_management.mapper.BookMapper;
import com.app.library_management.type.LoanType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@RequiredArgsConstructor
@Slf4j
public class BookDAO {
    private final BookMapper bookMapper;

    /* 도서 등록 */
    public void register(BookDTO bookDTO) {
        bookMapper.insertBook(new BookVO(bookDTO));
    }

    /* 도서 대여상태 수정 */
    public void updateBookStatus(Long bookId, LoanType bookStatus) {
        Map<String, Object> updateBookMap = new HashMap<>();
        updateBookMap.put("bookId", bookId);
        updateBookMap.put("bookStatus", bookStatus);

        bookMapper.updateBookStatus(updateBookMap);
    }

    /* 도서 검색 */
    public BookDTO selectByBookId(Long bookId) {
        return new BookDTO(bookMapper.selectByBookId(bookId));
    }

    /* 도서 수정 */
    public void modifyBookInfoByBookId(BookDTO bookDTO) {
        bookMapper.updateBtBookId(new BookVO(bookDTO));
    }
}
