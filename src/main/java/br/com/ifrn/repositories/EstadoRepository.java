package br.com.ifrn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifrn.domain.Estado;

/*
 * Serão realizadas operações de acesso a dados do objeto produto.
 */

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
