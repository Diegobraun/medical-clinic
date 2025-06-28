package br.com.diegobraun.medicalclinic.application.consulta.usecases;

import br.com.diegobraun.medicalclinic.application.consulta.gateways.ConsultaRepository;
import br.com.diegobraun.medicalclinic.domain.consulta.Consulta;
import br.com.diegobraun.medicalclinic.domain.consulta.Status;
import org.springframework.stereotype.Service;

@Service
public class AgendarConsulta {

    private final ConsultaRepository consultaRepository;

    public AgendarConsulta(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    public Consulta agendar(Consulta consulta) {
        consulta.setStatus(Status.AGENDADO);
        return consultaRepository.agendar(consulta);
    }
}
