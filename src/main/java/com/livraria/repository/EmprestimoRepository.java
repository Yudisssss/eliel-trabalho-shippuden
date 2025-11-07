package com.livraria.repository;

import com.livraria.entity.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}
