package br.com.diegobraun.medicalclinic.infrastructure.consulta.controller;

import br.com.diegobraun.medicalclinic.application.consulta.mappers.ConsultaMapper;
import br.com.diegobraun.medicalclinic.application.consulta.usecases.AgendarConsulta;
import br.com.diegobraun.medicalclinic.application.consulta.usecases.BuscarConsulta;
import br.com.diegobraun.medicalclinic.domain.consulta.Consulta;
import br.com.diegobraun.medicalclinic.infrastructure.consulta.controller.request.ConsultaRequest;
import br.com.diegobraun.medicalclinic.infrastructure.consulta.controller.response.ConsultaResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/consultas")
public class ConsultaController {

    private final AgendarConsulta agendarConsulta;
    private final BuscarConsulta buscarConsulta;
    private final ConsultaMapper consultaMapper;

    public ConsultaController(AgendarConsulta agendarConsulta, BuscarConsulta buscarConsulta, ConsultaMapper consultaMapper) {
        this.agendarConsulta = agendarConsulta;
        this.buscarConsulta = buscarConsulta;
        this.consultaMapper = consultaMapper;
    }

    @PostMapping("/agendar")
    public ConsultaResponse agendar(@RequestBody ConsultaRequest consultaRequest) {
        Consulta consulta = consultaMapper.toDomain(consultaRequest);
        return consultaMapper.toResponse(agendarConsulta.agendar(consulta));
    }

    @GetMapping("/{id}")
    public ConsultaResponse buscar(@PathVariable Long id) {
        return consultaMapper.toResponse(buscarConsulta.buscarPorId(id));
    }
}
