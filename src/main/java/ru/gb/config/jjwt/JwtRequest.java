package ru.gb.config.jjwt;

import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;
}
