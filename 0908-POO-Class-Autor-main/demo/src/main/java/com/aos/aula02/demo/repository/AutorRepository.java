package com.aos.aula02.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aos.aula02.demo.model.Autor;


@Repository
public interface AutorRepository extends JpaRepository<Autor,Long>{

    //Em todos os repositorios de interface JPA
    //save
    //findAll
    //delete
    //findById
    //deleteById
    public Autor findByNome(String nome);
    public Autor findByCPF(String CPF);
    public List<Autor> findByIdade (Short idade);
    public void deleteByNome(String nome);
    public void deleteByCPF(String CPF);
    public void deleteByIdade(String idade);
}
