package com.johnndichu.mini_blog_api.exception;

public class EmailAlreadyInUseException extends RuntimeException {
    public EmailAlreadyInUseException(String email) {
        super("Email already registered: " + email);
    }

}

