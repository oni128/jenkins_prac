package com.example.demo.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class CalculatorDTO {
    @NonNull
    private Integer num1;
    // notnull 어노테이션에 int는 원시타입이라 값이 무조건있어서 굳이 왜 필요하냐는 경고 문구가 안뜨도록 Integer라고 수정함.
    @NonNull
    private Integer num2;
    private int sum;
}
