package com.example.microservicio_mensajeria.infrastructure.input.rest;

import com.example.microservicio_mensajeria.application.dto.TwilioRequestDto;
import com.example.microservicio_mensajeria.application.handler.ITwilioHandler;
import com.example.microservicio_mensajeria.infrastructure.configuration.util.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/twilio")
public class TwilioRestController {

    private final ITwilioHandler twilioHandler;


    @Operation(summary = "Send a message", description = "Send a message")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Message sent")
    })
    @PostMapping("/send-message")
    public ResponseEntity<String> sendMessage(@RequestBody TwilioRequestDto twilioRequestDto) {
        twilioHandler.sendMessage(twilioRequestDto);
        return ResponseEntity.ok(Constants.MESSAGE_SEND);
    }

}
