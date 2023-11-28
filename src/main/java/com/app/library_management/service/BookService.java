package com.app.library_management.service;

import com.app.library_management.domain.dao.BookDAO;
import com.app.library_management.domain.dto.BookDTO;
import com.app.library_management.type.LoanType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookDAO bookDAO;

    /* 도서 등록 */
    public void register(BookDTO bookDTO) {
        bookDAO.register(bookDTO);
    }

    /* 도서 대여상태 수정 */
    public void updateBookStatus(Long bookId, LoanType bookStatus) {
        bookDAO.updateBookStatus(bookId, bookStatus);
    }

    /* 도서 검색 */
    public BookDTO selectByBookId(Long bookId) {
        return bookDAO.selectByBookId(bookId);
    }

    /* 도서 수정 */
    public void modifyBookInfoByBookId(BookDTO bookDTO) {
        bookDAO.modifyBookInfoByBookId(bookDTO);
    }
}
