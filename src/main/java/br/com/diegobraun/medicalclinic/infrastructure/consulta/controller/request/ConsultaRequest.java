package br.com.diegobraun.medicalclinic.infrastructure.consulta.controller.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ConsultaRequest {

    private Long pacienteId;

    private Long medicoId;

    private LocalDateTime dataConsulta;

}
