package com.app.library_management.controller;

import com.app.library_management.domain.dto.BookDTO;
import com.app.library_management.domain.dto.UserDTO;
import com.app.library_management.service.BookService;
import com.app.library_management.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/book/*")
@Slf4j
public class BookController {
    private final BookService bookService;

    /* 도서 등록 */
    @GetMapping("register")
    public void register(Model model) {
        model.addAttribute(new BookDTO());
    }

    @PostMapping("register")
    public RedirectView register(BookDTO bookDTO) {
        bookService.register(bookDTO);
        return new RedirectView("/main");
    }

}
