package Agenda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Agenda.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato,Long>{

	@Query("SELECT nome FROM Contato c WHERE c.nome = nome")
	List<Contato> findBynome(@Param("nome")String nome);
}
