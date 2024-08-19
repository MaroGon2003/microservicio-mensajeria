package com.example.microservicio_mensajeria.application.handler.impl;

import com.example.microservicio_mensajeria.application.dto.TwilioRequestDto;
import com.example.microservicio_mensajeria.application.handler.ITwilioHandler;
import com.example.microservicio_mensajeria.application.mapper.ITwilioRequestMapper;
import com.example.microservicio_mensajeria.domain.api.ITwilioServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TwilioHandler implements ITwilioHandler {

    private final ITwilioServicePort twilioServicePort;
    private final ITwilioRequestMapper twilioRequestMapper;

    @Override
    public void sendMessage(TwilioRequestDto twilioRequestDto) {

        twilioServicePort.sendMenssage(twilioRequestMapper.toTwilioModel(twilioRequestDto));

    }
}
