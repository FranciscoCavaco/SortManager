package com.sparta.francisco.exceptions;

public class ChildNotFoundException extends RuntimeException {
    @Override
    public String getMessage() {
        return "This node does not have a child";
    }
}
