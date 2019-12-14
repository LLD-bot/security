package com.example.securitydemo.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author hjf
 * @date 2019/10/28 - 10:51
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}