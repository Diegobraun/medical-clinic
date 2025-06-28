package br.com.diegobraun.medicalclinic.infrastructure.consulta.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConsultaMongoDbRepository extends MongoRepository<ConsultaEntity, Long> {
}
