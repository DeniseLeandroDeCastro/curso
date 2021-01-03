package br.com.ifrn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifrn.domain.Cidade;

/*
 * Serão realizadas operações de acesso a dados do objeto categoria.
 */

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
