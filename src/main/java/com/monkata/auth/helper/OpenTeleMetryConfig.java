package com.monkata.auth.helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.opentelemetry.exporter.zipkin.ZipkinSpanExporter;


@Configuration
public class OpenTeleMetryConfig {
	
	@Value("${spring.zipkin.url}")
	private String zipkinUrl;

    @Bean
    public ZipkinSpanExporter   zipkinSpanExporter () {
      System.out.print(zipkinUrl);	
      return ZipkinSpanExporter.builder()
                .setEndpoint(zipkinUrl)
                .build();
    }

}
