package com.advanced.spring.springadvanced.LogTraceConfig;

import com.advanced.spring.springadvanced.trace.logtrace.FieldLogTrace;
import com.advanced.spring.springadvanced.trace.logtrace.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new FieldLogTrace();
    }
}
