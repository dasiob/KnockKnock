package com.base.knockknock.model;

public enum Role {
    ADMIN("Admin"),
    DEFAULT("Default");

    private final String value;

    Role (String value) {
        this.value = value;
    }

    public String getValue () {
        return value;
    }

    public static Role findByValue(String value) {
        if (value == null) return null;
        for (Role role : Role.values()) {
            if (role.getValue().equalsIgnoreCase(value)) {
                return role;
            }
        }
        return null;
    }
}
