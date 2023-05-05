package com.example.kafkaproject;

import java.time.LocalDateTime;

public record Message(String message,
                      LocalDateTime created) {
}
