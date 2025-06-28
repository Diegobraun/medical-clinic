package br.com.diegobraun.medicalclinic.application.paciente.gateways;

import br.com.diegobraun.medicalclinic.domain.paciente.Paciente;

import java.util.UUID;

public interface PacienteRepository {

    Paciente buscarPorId(UUID id);
    Paciente cadastrar(Paciente paciente);
}
