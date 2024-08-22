package com.cjava.expert.modelo.servicios;

import com.cjava.expert.modelo.entidades.Curso;

import java.util.List;

public interface CursoService {
    public List<Curso> listar();
    public Curso buscar(String id);
    public void registrar(Curso curso);


}