package com.app.library_management.controller;

import com.app.library_management.service.BookLentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/management/*")
@Slf4j
public class BookLentController {
    private final BookLentService bookLentService;

    @GetMapping("book")
    public void management() {

    }
}
