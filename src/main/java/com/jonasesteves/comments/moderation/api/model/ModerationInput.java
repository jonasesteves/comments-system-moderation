package com.jonasesteves.comments.moderation.api.model;

import java.util.Objects;

public class ModerationInput {
    private String text;
    private String commentId;

    private ModerationInput(){}

    public ModerationInput(String text, String commentId) {
        this.text = text;
        this.commentId = commentId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ModerationInput that = (ModerationInput) o;
        return Objects.equals(text, that.text) && Objects.equals(commentId, that.commentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, commentId);
    }

    @Override
    public String toString() {
        return "ModerationInput{" +
                "text='" + text + '\'' +
                ", commentId='" + commentId + '\'' +
                '}';
    }
}
