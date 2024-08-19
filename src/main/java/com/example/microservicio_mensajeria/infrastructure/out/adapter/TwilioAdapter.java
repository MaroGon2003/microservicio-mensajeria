package com.example.microservicio_mensajeria.infrastructure.out.adapter;

import com.example.microservicio_mensajeria.domain.model.TwilioModel;
import com.example.microservicio_mensajeria.domain.spi.ITwilioPersistencePort;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioAdapter implements ITwilioPersistencePort {

    private static final  String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    private static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");
    private static final String TWILIO_PHONE_NUMBER = System.getenv("TWILIO_PHONE_NUMBER");


    @Override
    public void sendMessage(TwilioModel twilioModel) {

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message.creator(
                new PhoneNumber(twilioModel.getPhoneNumber()),
                new PhoneNumber(TWILIO_PHONE_NUMBER),
                twilioModel.getMessage()
        ).create();

    }
}
