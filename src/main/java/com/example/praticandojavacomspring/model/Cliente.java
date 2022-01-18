package com.example.praticandojavacomspring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    //ManytoOne = 1 cliente vai ter um endereço e um endereço para muitos clientes.
    @ManyToOne
    private Endereco endereco;



}
