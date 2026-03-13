package services;

import models.ProdutoModel;
import repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServices {

    @Autowired
    private ProdutoRepository repository;

    public List<ProdutoModel> findAll(){
        return repository.findAll();
    }

    public ProdutoModel criarProduto(ProdutoModel produto){
        return repository.save(produto);
    }

    public Optional<ProdutoModel> buscarId(Long id){
        return repository.findById(id);
    }

    public void deletarProduto(Long id){
        repository.deleteById(id);
    }

    public ProdutoModel atualizarProduto(Long id, ProdutoModel produto){
        produto.setId(id);
        return repository.save(produto);
    }
}