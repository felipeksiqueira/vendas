package com.estudos.vendas.service;

import com.estudos.vendas.model.Cliente;
import com.estudos.vendas.repository.ClientesRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@AllArgsConstructor
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        clientesRepository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente) {

    }
}
