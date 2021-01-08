package br.com.ifrn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifrn.domain.Pagamento;



@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
