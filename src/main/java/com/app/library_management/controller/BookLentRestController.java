package com.app.library_management.controller;

import com.app.library_management.domain.dto.BookLentDTO;
import com.app.library_management.service.BookLentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bookLents/*")
@Slf4j
public class BookLentRestController {
    private final BookLentService bookLentService;
    /* 도서대여 신청 */
    @PostMapping("lent")
    public void registerBookLent(@RequestBody BookLentDTO bookLentDTO){
        bookLentService.bookLentRegister(bookLentDTO);
    }

    /* 도서반납 신청 */
    @PostMapping("return")
    public void returnBook(@RequestBody String returnInfo) {
        JSONObject jsonObject = new JSONObject(returnInfo);

        bookLentService.deleteForReturn(
                Long.parseLong(jsonObject.getString("userId")),
                Long.parseLong(jsonObject.getString("bookId"))
        );
    }
}
