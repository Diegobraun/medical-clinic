package br.com.diegobraun.medicalclinic.infrastructure.consulta.controller.response;

import br.com.diegobraun.medicalclinic.domain.consulta.Status;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ConsultaResponse {

    private String id;

    private Long pacienteId;

    private Long medicoId;

    private LocalDateTime dataConsulta;

    private Status status;

    private String motivo;
}
