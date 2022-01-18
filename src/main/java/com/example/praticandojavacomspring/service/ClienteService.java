package com.example.praticandojavacomspring.service;
import com.example.praticandojavacomspring.model.Cliente;


public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Cliente cliente, Long Id);
    void deletar (Long id);
}
