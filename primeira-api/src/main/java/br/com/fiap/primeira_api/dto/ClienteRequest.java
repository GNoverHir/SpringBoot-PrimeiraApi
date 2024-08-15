package br.com.fiap.primeira_api.dto;

import lombok.Data;

@Data
public class ClienteRequest {
    private String nome;
    private String email;
    private String senha;
}
