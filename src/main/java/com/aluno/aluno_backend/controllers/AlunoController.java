package com.aluno.aluno_backend.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aluno.aluno_backend.entities.Aluno;
import com.aluno.aluno_backend.services.AlunoService;

@RestController
@CrossOrigin
public class AlunoController {

    @Autowired
    private AlunoService service;


    @GetMapping("students")
    public List<Aluno> getAlunos(){
        return service.getAlunos();
        
      
        
    }



    
}
