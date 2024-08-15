package br.com.fiap.primeira_api.dto;

import lombok.Data;

@Data
public class ClienteResponse {
    private String nome;
    private String email;
    private int id;
}
