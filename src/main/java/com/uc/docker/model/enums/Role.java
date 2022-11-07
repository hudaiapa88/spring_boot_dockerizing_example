package com.uc.docker.model.enums;

public enum Role {
    TEACHER(Value.TEACHER),
    STUDENT(Value.STUDENT),
    ADMIN(Value.ADMIN);

    private String value;

     Role(String value) {
        if (!this.name().equals(value))
            throw new IllegalArgumentException("Incorrect use of Role");
    }


    public static class Value {
        public static final String TEACHER = "TEACHER";
        public static final String STUDENT = "STUDENT";
        public static final String ADMIN = "ADMIN";
    }
    }
