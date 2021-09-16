package br.com.cjrnew.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cjrnew.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
