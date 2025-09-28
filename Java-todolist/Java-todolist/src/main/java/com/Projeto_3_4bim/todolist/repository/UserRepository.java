package com.Projeto_3_4bim.todolist.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Projeto_3_4bim.todolist.model.User;

/**
 * UserRepository é uma interface que estende JpaRepository.
 * Ela herda métodos CRUD (Create, Read, Update, Delete) para a entidade User
 * sem a necessidade de implementação manual.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Define um método para buscar um usuário pelo seu nome de usuário (username).
     * O Spring Data JPA implementará automaticamente este método.
     *
     * @param username O nome de usuário a ser procurado.
     * @return um Optional contendo o User se encontrado, ou um Optional vazio caso contrário.
     */
    Optional<User> findByUsername(String username);

}
