package br.com.diegobraun.medicalclinic.application.paciente.usecases;

import br.com.diegobraun.medicalclinic.application.paciente.gateways.PacienteRepository;
import br.com.diegobraun.medicalclinic.domain.paciente.Paciente;

import java.util.UUID;

public class BuscarPaciente {

    private final PacienteRepository pacienteRepository;

    public BuscarPaciente(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public Paciente buscar(UUID id) {
        return pacienteRepository.buscarPorId(id);
    }
}
