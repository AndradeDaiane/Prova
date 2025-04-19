package com.example.provas.service;

import com.example.provas.model.Categoria;
import com.example.provas.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Anotação que indica que esta classe é um serviço do Spring
@Service
public class CategoriaService {

    // Injeção de dependência do repositório de categorias
    @Autowired
    private CategoriaRepository categoriaRepository;

    // Método para buscar todas as categorias
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    // Método para buscar uma categoria pelo ID
    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    // Método para salvar uma nova categoria ou atualizar uma existente
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // Método para deletar uma categoria pelo ID
    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }
}

