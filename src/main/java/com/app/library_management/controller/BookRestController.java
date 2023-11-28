package com.app.library_management.controller;

import com.app.library_management.domain.dto.BookDTO;
import com.app.library_management.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books/*")
@Slf4j
public class BookRestController {
    private final BookService bookService;

    /* 도서 검색 */
    @GetMapping("search")
    public BookDTO searchBookInfoByBookId(@RequestParam("id") String id) {
        return bookService.selectByBookId(Long.parseLong(id));
    }

    /* 도서 수정 */
    @PostMapping("modify")
    public BookDTO modifyBookInfoByBookId(@RequestBody BookDTO bookDTO) {
        bookService.modifyBookInfoByBookId(bookDTO);
        return bookDTO;
    }

    /* 도서 등록 */
    @PostMapping("register")
    public void registerBookInfo(@RequestBody BookDTO bookDTO) {
        bookService.register(bookDTO);
    }
}
