package com.example.microservicio_mensajeria.application.handler;

import com.example.microservicio_mensajeria.application.dto.TwilioRequestDto;

public interface ITwilioHandler {

    void sendMessage(TwilioRequestDto twilioRequestDto);

}
