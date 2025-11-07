package com.livraria.repository;

import com.livraria.model.Periodico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodicoRepository extends JpaRepository<Periodico,Long>{
}
