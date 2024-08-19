package com.example.microservicio_mensajeria.infrastructure.configuration;

import com.example.microservicio_mensajeria.domain.api.ITwilioServicePort;
import com.example.microservicio_mensajeria.domain.spi.ITwilioPersistencePort;
import com.example.microservicio_mensajeria.domain.useCase.TwilioUseCase;
import com.example.microservicio_mensajeria.infrastructure.out.adapter.TwilioAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public ITwilioPersistencePort twilioPersistencePort() {
        return new TwilioAdapter();
    }

    @Bean
    public ITwilioServicePort twilioServicePort() {
        return new TwilioUseCase(twilioPersistencePort());
    }

}
