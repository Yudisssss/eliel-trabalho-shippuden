package com.livraria.service;

import com.livraria.entity.Periodico;
import com.livraria.repository.PeriodicoRepository;
import org.springframework.stereotype.Service;

@Service
public class PeriodicoService {
    private PeriodicoRepository periodicoRepository;

    public Periodico salvarPeridico(Periodico periodico){
        return periodicoRepository.save(periodico);
    }

}
