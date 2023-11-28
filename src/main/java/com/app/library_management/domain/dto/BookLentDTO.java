package com.app.library_management.domain.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BookLentDTO {
    private Long id;
    private String bookLentLoanDate;
    private String bookLentReturnDate;
    private Long userId;
    private Long bookId;
}
