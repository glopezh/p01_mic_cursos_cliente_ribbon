package com.cjava.expert.controlleres;

import com.cjava.expert.modelo.entidades.Curso;
import com.cjava.expert.modelo.servicios.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CursoController {
    @Qualifier("cursoServiceFeign")
    @Autowired
    CursoService cursoService;

    @RequestMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
    public String getHealthCheck()	{
        return "{ \"todoOk\" : true }";
    }

    @GetMapping("/cursos")
    public List<Curso> getCursos(){
        return cursoService.listar();
    }

}
