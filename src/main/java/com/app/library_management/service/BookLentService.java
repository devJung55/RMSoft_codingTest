package com.app.library_management.service;

import com.app.library_management.domain.dao.BookDAO;
import com.app.library_management.domain.dao.BookLentDAO;
import com.app.library_management.domain.dto.BookLentDTO;
import com.app.library_management.type.LoanType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookLentService {
    private final BookLentDAO bookLentDAO;
    private final BookDAO bookDAO;

    /* 도서대여 신청 */
    public void bookLentRegister(BookLentDTO bookLentDTO) {
        bookLentDAO.bookLentRegister(bookLentDTO);
        bookDAO.updateBookStatus(bookLentDTO.getBookId(), LoanType.CURRNETLYONLOAN);
    }

    /* 도서반납 신청 */
    public void deleteForReturn(Long userId, Long bookId) {
        bookLentDAO.deleteForReturn(userId, bookId);
    }
}
