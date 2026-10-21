package com.johnndichu.mini_blog_api.dtos;

import com.johnndichu.mini_blog_api.entity.Comment;

import java.util.UUID;

public record CommentResponse(UUID id, String body) {
    public static CommentResponse from(Comment comment) {
        return new CommentResponse(comment.getId(), comment.getBody());
    }
}
