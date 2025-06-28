package br.com.diegobraun.medicalclinic.infrastructure.consulta.persistence;

import br.com.diegobraun.medicalclinic.domain.consulta.MedicoId;
import br.com.diegobraun.medicalclinic.domain.consulta.PacienteId;
import br.com.diegobraun.medicalclinic.domain.consulta.Status;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@Document(collection = "consultas")
public class ConsultaEntity {

    @Id
    private String id;

    private PacienteId pacienteId;

    private MedicoId medicoId;

    private LocalDateTime dataConsulta;

    private Status status;

    private String motivo;
}
