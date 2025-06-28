package br.com.diegobraun.medicalclinic.domain.paciente;

import br.com.diegobraun.medicalclinic.shared.domain.Endereco;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Paciente {

    private Long id;

    private String nome;

    private String cpf;

    private String email;

    private Endereco endereco;
}
