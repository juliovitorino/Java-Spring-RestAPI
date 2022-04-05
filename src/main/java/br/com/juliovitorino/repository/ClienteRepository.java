package br.com.juliovitorino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.juliovitorino.model.Cliente;

/**
 * Interface para implementação dos metodos de acesso ao repositório (CRUD) e outros mais
 * @author Julio
 *
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
