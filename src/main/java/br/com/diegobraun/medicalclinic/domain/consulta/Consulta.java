package br.com.diegobraun.medicalclinic.domain.consulta;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Consulta {

    private String id;

    private PacienteId pacienteId;

    private MedicoId medicoId;

    private LocalDateTime dataConsulta;

    private Status status;

    private String motivo;
}
