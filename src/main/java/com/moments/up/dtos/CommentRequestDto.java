package com.moments.up.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommentRequestDto {
    private String comment;
    private Long climberId;
    private Long userId;
}
