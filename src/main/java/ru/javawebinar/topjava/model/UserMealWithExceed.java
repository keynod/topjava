package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;

public class UserMealWithExceed {
    private final LocalDateTime dateTime;

    private final String description;

    private final int calories;

    private final boolean exceed;

    public UserMealWithExceed(LocalDateTime dateTime, String description, int calories, boolean excess) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
        this.exceed = excess;
    }

    @Override
    public String toString() {
        return "UserMealWithExcess{" +
            "dateTime=" + dateTime +
            ", description='" + description + '\'' +
            ", calories=" + calories +
            ", exceed=" + exceed +
            '}';
    }
}
