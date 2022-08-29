package com.jojoldu.book.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    GUEST("ROLE_GUEST", "ゲスト"),
    USER("ROLE_USER", "ユーザ");

    private final String key;
    private final String title;

}
