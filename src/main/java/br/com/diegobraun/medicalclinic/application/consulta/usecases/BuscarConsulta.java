package br.com.diegobraun.medicalclinic.application.consulta.usecases;

import br.com.diegobraun.medicalclinic.application.consulta.gateways.ConsultaRepository;
import br.com.diegobraun.medicalclinic.domain.consulta.Consulta;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BuscarConsulta {

    private final ConsultaRepository consultaRepository;

    public BuscarConsulta(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    public Consulta buscarPorId(Long id) {
        return consultaRepository.buscarPorId(id);
    }
}
