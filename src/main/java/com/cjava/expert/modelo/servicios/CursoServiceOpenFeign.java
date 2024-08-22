package com.cjava.expert.modelo.servicios;

import com.cjava.expert.clientes.CursoClienteRest;
import com.cjava.expert.modelo.entidades.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cursoServiceFeign")
public class CursoServiceOpenFeign implements CursoService {
    @Autowired
    public CursoClienteRest cursoFeign;

    @Override
    public List<Curso> listar() {
        return cursoFeign.listar();
    }

    @Override
    public Curso buscar(String id) {
        return null;
    }

    @Override
    public void registrar(Curso curso) {

    }

}
