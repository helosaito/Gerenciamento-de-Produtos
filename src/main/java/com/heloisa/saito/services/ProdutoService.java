package com.heloisa.saito.services;

import com.heloisa.saito.models.ProdutoModel;
import com.heloisa.saito.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll() {
        return produtoRepository.findAll();
    }

    public ProdutoModel criarProduto(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }

    public Optional<ProdutoModel> buscarProduto(Long id) {
        return produtoRepository.findById(id);
    }

    public Optional<ProdutoModel> listarProduto(Long id) {
        return produtoRepository.findById(id);
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
