package com.example.microservicio_mensajeria.domain.api;

import com.example.microservicio_mensajeria.domain.model.TwilioModel;

public interface ITwilioServicePort {

    void sendMenssage(TwilioModel twilioModel);

}
