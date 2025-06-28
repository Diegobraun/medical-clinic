package br.com.diegobraun.medicalclinic.infrastructure.consulta.persistence.mappers;

import br.com.diegobraun.medicalclinic.domain.consulta.Consulta;
import br.com.diegobraun.medicalclinic.domain.consulta.MedicoId;
import br.com.diegobraun.medicalclinic.domain.consulta.PacienteId;
import br.com.diegobraun.medicalclinic.infrastructure.consulta.persistence.ConsultaEntity;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

@Component
public class ConsultaEntityMapper {

    public ConsultaEntity toEntity(Consulta domain) {
        ConsultaEntity entity = new ConsultaEntity();
        entity.setId(domain.getId());
        entity.setMedicoId(domain.getMedicoId() != null ? domain.getMedicoId() : null);
        entity.setPacienteId(domain.getPacienteId() != null ? domain.getPacienteId() : null);
        entity.setDataConsulta(domain.getDataConsulta());
        entity.setStatus(domain.getStatus());
        entity.setMotivo(domain.getMotivo());
        return entity;
    }

    public Consulta toDomain(ConsultaEntity entity) {
        Consulta domain = new Consulta();
        domain.setId(entity.getId());
        domain.setMedicoId(new MedicoId(entity.getMedicoId().getId()));
        domain.setPacienteId(new PacienteId(entity.getPacienteId().getId()));
        domain.setDataConsulta(entity.getDataConsulta());
        domain.setStatus(entity.getStatus());
        domain.setMotivo(entity.getMotivo());
        return domain;
    }
}
