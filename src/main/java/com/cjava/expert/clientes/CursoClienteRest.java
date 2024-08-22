package com.cjava.expert.clientes;

import com.cjava.expert.modelo.entidades.Curso;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "cjava-cursos")
public interface CursoClienteRest {

    @GetMapping("/cursos")
    public List<Curso> listar();
}
