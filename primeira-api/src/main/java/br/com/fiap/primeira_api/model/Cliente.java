package br.com.fiap.primeira_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cliente_nome")
    private String nome;
    @Column(name = "cliente_email")
    private String email;
    @Column(name = "cliente_senha")
    private String senha;

    }

