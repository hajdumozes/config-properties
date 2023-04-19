package com.poc.configproperties.scheduled;

import com.poc.configproperties.config.ApplicationConfigurationProperties;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class ConfigurationLogger {
    ApplicationConfigurationProperties configurationProperties;

    @Scheduled(fixedDelay = 10000)
    public void logConfig() {
        log.info(configurationProperties.toString());
    }
}
