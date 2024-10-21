package com.example.demo.controller;

import com.example.demo.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/produto")
public class Controller {
    // simula no banco de dados
    private static final Map<Long, Produto> produtos = new HashMap<>();
    static {
        produtos.put(1L, new Produto(1L, "Mouse óptico", "sem fio", 120.0));
        produtos.put(2L, new Produto(2L, "Teclado mecânico", "semi", 100.0));
        produtos.put(3L, new Produto(3L, "Monitor", "lcd", 600.00));
    }

    @GetMapping("/produtos")
    public Map<Long, Produto> getProdutos() {
        return produtos;
    }

    @PostMapping()
    public Produto addProduto(@RequestBody Produto produto) {
        produtos.put(produto.getId(), produto);
        return produto;
    }

    @DeleteMapping("/{id}")
    public Produto deleteProduto(@PathVariable Long id) {
        return produtos.remove(id);
    }

    @PatchMapping("/{id}")
    public Produto updateProduto(@PathVariable Long id, @RequestBody Produto produto) {
        produto.setId(id);
        return produtos.put(id, produto);
    }



}
