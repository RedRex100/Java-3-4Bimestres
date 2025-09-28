package com.Projeto_3_4bim.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador para gerenciar as funcionalidades relacionadas às tarefas.
 * Para a entrega do terceiro bimestre, este controlador apenas exibe a página
 * principal de tarefas, que é uma rota protegida.
 */
@Controller
public class TaskController {

    /**
     * Exibe a página principal de tarefas.
     * Esta rota é protegida pelo Spring Security, conforme configurado em SecurityConfig.java.
     * Apenas usuários autenticados podem acessá-la.
     * @return o nome da view de tarefas (tasks.html)
     */
    @GetMapping("/tasks")
    public String showTasksPage() {
        return "tasks";
    }

    // No quarto bimestre, adicionaremos aqui os métodos para criar, listar, atualizar
    // e deletar tarefas.
}
