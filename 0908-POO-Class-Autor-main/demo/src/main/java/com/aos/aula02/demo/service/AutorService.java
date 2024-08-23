package com.aos.aula02.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aos.aula02.demo.model.Autor;
import com.aos.aula02.demo.repository.AutorRepository;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public void inserirAutor(Autor autor) {
        autorRepository.save(autor);
    }

    // Buscar

    public List<Autor> buscarTodosAutores() {
        return autorRepository.findAll();
    }

    public Autor buscarPeloId(Long id) {
        return autorRepository.findById(id);
    }

    public Autor buscarPeloNome(String nome) {
        return autorRepository.findByNome(nome);
    }

    public Autor buscarPeloCPF(String CPF) {
        return autorRepository.findByCPF(CPF);
    }

    public List<Autor> buscarPelaIdade(Short idade) {
        return autorRepository.findByIdade(idade);
    }

    // DELETE

    public void deletaAutor(Autor autor) {
        autorRepository.delete(autor);
    }

    public void deletaPeloId(Long id) {
        autorRepository.deleteById(id);
    }

    public void deletePeloNome(String nome) {
            autorRepository.deleteByNome(autor);
        }

    public void deletePeloCPF(String CPF) {
            autorRepository.deleteByCPF(CPF);
        }

    public void deletePelaIdade(Short idade) {
            autorRepository.deleteByIdade(idade);
        }
    }

