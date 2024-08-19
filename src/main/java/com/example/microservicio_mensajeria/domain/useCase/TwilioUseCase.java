package com.example.microservicio_mensajeria.domain.useCase;

import com.example.microservicio_mensajeria.domain.api.ITwilioServicePort;
import com.example.microservicio_mensajeria.domain.model.TwilioModel;
import com.example.microservicio_mensajeria.domain.spi.ITwilioPersistencePort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TwilioUseCase implements ITwilioServicePort {

    private final ITwilioPersistencePort twilioPersistencePort;

    @Override
    public void sendMenssage(TwilioModel twilioModel) {

        if (twilioModel.getMessage() == null || twilioModel.getPhoneNumber() == null) {
            throw new NullPointerException();
        }

        twilioPersistencePort.sendMessage(twilioModel);

    }
}
