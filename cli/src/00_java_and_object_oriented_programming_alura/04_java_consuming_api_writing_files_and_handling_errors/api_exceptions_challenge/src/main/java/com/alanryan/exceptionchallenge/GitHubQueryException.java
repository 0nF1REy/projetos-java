package com.alanryan.exceptionchallenge;

public class GitHubQueryException extends RuntimeException {
    private String message;

    public GitHubQueryException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
