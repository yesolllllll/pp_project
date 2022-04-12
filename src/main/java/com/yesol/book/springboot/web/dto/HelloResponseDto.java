package com.yesol.book.springboot.web.dto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor //선언된 모든 final 필드가 포함된 생성자를 생성 (final 없으면 생성 x)
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
