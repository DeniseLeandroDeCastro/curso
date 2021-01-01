package br.com.ifrn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifrn.domain.Produto;

/*
 * Serão realizadas operações de acesso a dados do objeto produto.
 */

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
