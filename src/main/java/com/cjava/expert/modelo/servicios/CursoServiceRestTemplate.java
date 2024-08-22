package com.cjava.expert.modelo.servicios;

import com.cjava.expert.modelo.entidades.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("cursoServiceRestTeamplate")
public class CursoServiceRestTemplate implements CursoService{
    @Autowired
    RestTemplate clienteRest;
    @Override
    public List<Curso> listar() {
        return clienteRest.getForObject("http://cjava-cursos/cursos", List.class);
    }

    @Override
    public Curso buscar(String id) {
        return null;
    }

    @Override
    public void registrar(Curso curso) {

    }
}
