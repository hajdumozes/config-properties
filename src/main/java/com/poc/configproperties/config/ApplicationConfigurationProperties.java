package com.poc.configproperties.config;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApplicationConfigurationProperties {
    String name;
    String description;
    Status status;

    @Data
    public static class Status {
        String role;
        String lifeCycle;
    }
}
