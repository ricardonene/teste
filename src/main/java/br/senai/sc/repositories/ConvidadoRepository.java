package br.senai.sc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.senai.sc.domain.Convidado;

@Repository
public interface ConvidadoRepository extends JpaRepository<Convidado, Integer> {

}
