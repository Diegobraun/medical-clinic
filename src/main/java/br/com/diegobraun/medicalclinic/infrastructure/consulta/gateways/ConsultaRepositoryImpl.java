package br.com.diegobraun.medicalclinic.infrastructure.consulta.gateways;

import br.com.diegobraun.medicalclinic.application.consulta.gateways.ConsultaRepository;

import br.com.diegobraun.medicalclinic.domain.consulta.Consulta;
import br.com.diegobraun.medicalclinic.infrastructure.consulta.persistence.ConsultaEntity;
import br.com.diegobraun.medicalclinic.infrastructure.consulta.persistence.ConsultaMongoDbRepository;
import br.com.diegobraun.medicalclinic.infrastructure.consulta.persistence.mappers.ConsultaEntityMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ConsultaRepositoryImpl implements ConsultaRepository {

    private final ConsultaMongoDbRepository repository;
    private final ConsultaEntityMapper mapper;

    public ConsultaRepositoryImpl(ConsultaMongoDbRepository repository, ConsultaEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Consulta agendar(Consulta consulta) {
        ConsultaEntity entity = mapper.toEntity(consulta);
        return mapper.toDomain(repository.save(entity));
    }

    @Override
    public Consulta buscarPorId(Long id) {
        Optional<ConsultaEntity> consulta = repository.findById(id);

        return consulta.map(mapper::toDomain).orElse(null);
    }
}
