package br.com.fiap.primeira_api.service;

import br.com.fiap.primeira_api.dto.ClienteRequest;
import br.com.fiap.primeira_api.dto.ClienteResponse;
import br.com.fiap.primeira_api.model.Cliente;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    public Cliente dtoToCLiente(ClienteRequest clienteRequest) {
        Cliente cliente = new Cliente();
        cliente.setNome(clienteRequest.getNome());
        cliente.setEmail(clienteRequest.getEmail());
        cliente.setSenha(clienteRequest.getSenha());
        return cliente;
    }

    public ClienteResponse clienteResponse(Cliente cliente){
        ClienteResponse clienteResponse = new ClienteResponse();
        clienteResponse.setNome(cliente.getNome());
        clienteResponse.setEmail(cliente.getEmail());
        clienteResponse.setId(cliente.getId());
        return clienteResponse;
    }
}
