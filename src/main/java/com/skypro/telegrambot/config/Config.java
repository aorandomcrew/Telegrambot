package com.skypro.telegrambot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data//автоматические конструкторы для класса
@PropertySource("application.properties")
public class Config {
    @Value("${bot.name}")
    String botName;
    @Value("${bot.key}")
    String token;
}
