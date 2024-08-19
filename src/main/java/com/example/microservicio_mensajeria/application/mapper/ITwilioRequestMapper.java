package com.example.microservicio_mensajeria.application.mapper;

import com.example.microservicio_mensajeria.application.dto.TwilioRequestDto;
import com.example.microservicio_mensajeria.domain.model.TwilioModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITwilioRequestMapper {

    TwilioModel toTwilioModel(TwilioRequestDto twilioRequestDto);

}
