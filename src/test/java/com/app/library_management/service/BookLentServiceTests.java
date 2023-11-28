package com.app.library_management.service;

import com.app.library_management.domain.dto.BookDTO;
import com.app.library_management.domain.dto.BookLentDTO;
import com.app.library_management.type.LoanType;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BookLentServiceTests {
    @Autowired
    private BookLentService bookLentService;

    @Autowired
    private BookService bookService;

    /* 도서대여 신청 시, 도서대여 테이블 insert 및 도서대여 상태 수정 */
    @Test
    public void bookLentServiceTest() {
        BookLentDTO bookLentDTO = new BookLentDTO();

        bookLentDTO.setBookId(1L);
        bookLentDTO.setUserId(1L);
        bookLentDTO.setBookLentReturnDate("2023-12-04");

        bookLentService.bookLentRegister(bookLentDTO);
    }

    @Test
    public void modifyBookInfo() {
        BookDTO bookDTO = new BookDTO();

        bookDTO.setId(1L);
        bookDTO.setBookTitle("개미");
        bookDTO.setBookAuthor("베르베르베르나르");
        bookDTO.setBookPublisher("정지");

        bookService.modifyBookInfoByBookId(bookDTO);
    }
}
