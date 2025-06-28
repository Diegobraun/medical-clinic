package br.com.diegobraun.medicalclinic.application.paciente.usecases;

import br.com.diegobraun.medicalclinic.application.paciente.gateways.PacienteRepository;
import br.com.diegobraun.medicalclinic.domain.paciente.Paciente;

public class CadastrarPaciente {

    private final PacienteRepository pacienteRepository;

    public CadastrarPaciente(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public Paciente cadastrar(Paciente paciente) {
        return pacienteRepository.cadastrar(paciente);
    }
}
