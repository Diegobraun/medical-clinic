package br.com.diegobraun.medicalclinic.application.medico.usecases;

import br.com.diegobraun.medicalclinic.application.medico.gateways.MedicoRepository;
import br.com.diegobraun.medicalclinic.domain.medico.Medico;

import java.util.UUID;

public class BuscarMedico {

    private final MedicoRepository medicoRepository;

    public BuscarMedico(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public Medico buscar(UUID id) {
        return medicoRepository.buscarPorId(id);
    }
}
