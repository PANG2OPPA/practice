package com.kh.practice.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BoardDto {
    private Long boardId;
    private String email;
    private String categoryId;
    private String title;
    private String content;
    private String img;
    private LocalDateTime regDate;

}
