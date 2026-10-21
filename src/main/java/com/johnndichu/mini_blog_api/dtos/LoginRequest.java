package com.johnndichu.mini_blog_api.dtos;

public record LoginRequest(
        String email,
        String password
) {
}
