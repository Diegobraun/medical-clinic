package br.com.diegobraun.medicalclinic.application.medico.gateways;

import br.com.diegobraun.medicalclinic.domain.medico.Medico;

import java.util.UUID;

public interface MedicoRepository {

    Medico cadastrar(Medico medico);
    Medico buscarPorId(UUID id);
}
