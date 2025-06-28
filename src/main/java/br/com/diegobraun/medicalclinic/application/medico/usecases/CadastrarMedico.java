package br.com.diegobraun.medicalclinic.application.medico.usecases;

import br.com.diegobraun.medicalclinic.application.medico.gateways.MedicoRepository;
import br.com.diegobraun.medicalclinic.domain.medico.Medico;

public class CadastrarMedico {

    private final MedicoRepository medicoRepository;

    public CadastrarMedico(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public Medico cadastrar(Medico medico) {
        return medicoRepository.cadastrar(medico);
    }
}
