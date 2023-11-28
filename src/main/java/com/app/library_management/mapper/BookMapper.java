package com.app.library_management.mapper;

import com.app.library_management.domain.vo.BookVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface BookMapper {
    /* 도서 등록 */
    public void insertBook(BookVO bookVO);

    /* 도서 대여상태 수정 */
    public void updateBookStatus(Map<String, Object> updateBookMap);

    /* 도서 검색 */
    public BookVO selectByBookId(Long bookId);

    /* 도서 수정 */
    public void updateBtBookId(BookVO bookVO);
}
