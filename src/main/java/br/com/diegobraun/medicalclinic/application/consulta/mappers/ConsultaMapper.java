package br.com.diegobraun.medicalclinic.application.consulta.mappers;

import br.com.diegobraun.medicalclinic.domain.consulta.Consulta;
import br.com.diegobraun.medicalclinic.domain.consulta.MedicoId;
import br.com.diegobraun.medicalclinic.domain.consulta.PacienteId;
import br.com.diegobraun.medicalclinic.infrastructure.consulta.controller.request.ConsultaRequest;
import br.com.diegobraun.medicalclinic.infrastructure.consulta.controller.response.ConsultaResponse;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ConsultaMapper {

    public Consulta toDomain(ConsultaRequest request) {
        Consulta consulta = new Consulta();

        consulta.setPacienteId(new PacienteId(request.getPacienteId()));
        consulta.setMedicoId(new MedicoId(request.getMedicoId()));
        consulta.setDataConsulta(request.getDataConsulta());
        // O id, status e motivo normalmente serão setados depois (ex: na criação pelo service)

        return consulta;
    }

    public ConsultaResponse toResponse(Consulta consulta) {
        ConsultaResponse response = new ConsultaResponse();

        response.setId(consulta.getId());
        response.setPacienteId(consulta.getPacienteId() != null ? consulta.getPacienteId().getId() : null);
        response.setMedicoId(consulta.getMedicoId() != null ? consulta.getMedicoId().getId() : null);
        response.setDataConsulta(consulta.getDataConsulta());
        response.setStatus(consulta.getStatus());
        response.setMotivo(consulta.getMotivo());

        return response;
    }
}
