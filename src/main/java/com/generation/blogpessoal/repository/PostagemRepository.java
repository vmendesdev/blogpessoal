package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Postagem;

//public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	//public List <Postagem> findAllByTituloContainingTgnoreCase(@Param("titulo") String titulo);
//}

public interface PostagemRepository extends JpaRepository<Postagem, Long> {
    List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
}

