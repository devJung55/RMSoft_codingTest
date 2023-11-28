package com.app.library_management.domain.vo;

import com.app.library_management.domain.dto.BookDTO;
import com.app.library_management.domain.dto.UserDTO;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class BookVO {
    private Long id;
    private String bookTitle;
    private String bookAuthor;
    private String bookPublisher;
    private String bookRegisterDate;
    private String bookStatus;

    @Builder
    public BookVO(BookDTO bookDTO) {
        this.id = bookDTO.getId();
        this.bookTitle = bookDTO.getBookTitle();
        this.bookAuthor = bookDTO.getBookAuthor();
        this.bookPublisher = bookDTO.getBookPublisher();
    }
}
