package com.app.library_management.domain.dto;

import com.app.library_management.domain.vo.BookVO;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class BookDTO {
    private Long id;
    private String bookTitle;
    private String bookAuthor;
    private String bookPublisher;
    private String bookRegisterDate;
    private String bookStatus;

    @Builder
    public BookDTO(BookVO bookVO) {
        this.bookTitle = bookVO.getBookTitle();
        this.bookAuthor = bookVO.getBookAuthor();
        this.bookPublisher = bookVO.getBookPublisher();
    }
}
