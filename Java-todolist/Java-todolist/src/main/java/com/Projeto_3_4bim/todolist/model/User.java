package com.Projeto_3_4bim.todolist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * A classe User representa a entidade de usuário no banco de dados.
 * Cada instância desta classe corresponde a uma linha na tabela 'users'.
 */
@Data // Anotação do Lombok para gerar getters, setters, equals, hashCode e toString.
@Entity // Anotação que marca esta classe como uma entidade JPA (mapeada para o banco).
@Table(name = "users") // Especifica o nome da tabela no banco de dados.
public class User {

    @Id // Marca o campo 'id' como a chave primária da tabela.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configura a geração automática do ID.
    private Long id;

    @Column(unique = true, nullable = false) // Garante que o username seja único e não nulo.
    private String username;

    @Column(nullable = false) // Garante que a senha não seja nula.
    private String password;

}
