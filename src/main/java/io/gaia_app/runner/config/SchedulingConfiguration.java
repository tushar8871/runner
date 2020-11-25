package io.gaia_app.runner.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ConditionalOnProperty(prefix = "gaia.runner.scheduling", name="enabled", havingValue="true", matchIfMissing = true)
public class SchedulingConfiguration {
}