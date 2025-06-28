package br.com.diegobraun.medicalclinic.domain.medico;

import br.com.diegobraun.medicalclinic.shared.domain.Endereco;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Medico {

    private Long id;

    private String nome;

    private String cpf;

    private String especialidade;

    private String crm;

    private boolean status;

    private Endereco endereco;
}
