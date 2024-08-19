package com.example.microservicio_mensajeria.domain.spi;

import com.example.microservicio_mensajeria.domain.model.TwilioModel;

public interface ITwilioPersistencePort {

    void sendMessage(TwilioModel twilioModel);

}
