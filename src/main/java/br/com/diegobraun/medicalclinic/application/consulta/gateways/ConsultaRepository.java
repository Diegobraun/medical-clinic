package br.com.diegobraun.medicalclinic.application.consulta.gateways;

import br.com.diegobraun.medicalclinic.domain.consulta.Consulta;

import java.util.UUID;

public interface ConsultaRepository {

    Consulta agendar(Consulta consulta);
    Consulta buscarPorId(Long id);

}
