package com.aluno.aluno_backend.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aluno.aluno_backend.entities.Aluno;
import com.aluno.aluno_backend.repositories.AlunoRepository;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository; 
    public List<Aluno> getAlunos() {
        return repository.findAll(); 
    }
}
