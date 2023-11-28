package com.app.library_management.domain.vo;

import com.app.library_management.domain.dto.BookLentDTO;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class BookLentVO {
    private Long id;
    private String bookLentLoanDate;
    private String bookLentReturnDate;
    private Long userId;
    private Long bookId;

    @Builder
    public BookLentVO(BookLentDTO bookLentDTO){
        this.bookLentReturnDate = bookLentDTO.getBookLentReturnDate();
        this.userId = bookLentDTO.getUserId();
        this.bookId = bookLentDTO.getBookId();
    }
}
