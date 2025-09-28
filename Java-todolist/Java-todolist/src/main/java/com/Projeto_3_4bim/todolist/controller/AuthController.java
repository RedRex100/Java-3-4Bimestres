package com.Projeto_3_4bim.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Projeto_3_4bim.todolist.model.User;
import com.Projeto_3_4bim.todolist.repository.UserRepository;
import com.Projeto_3_4bim.todolist.service.UserService;

/**
 * Controlador responsável por lidar com as requisições de autenticação,
 * como login e registro de novos usuários.
 */
@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    /**
     * Exibe a página de login.
     * @return o nome da view de login (login.html)
     */
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    /**
     * Exibe o formulário de registro.
     * @param model O modelo para adicionar atributos para a view.
     * @return o nome da view de registro (register.html)
     */
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        // Adiciona um objeto User vazio ao modelo para que o formulário Thymeleaf
        // possa vincular os dados a ele.
        model.addAttribute("user", new User());
        return "register";
    }

    /**
     * Processa o envio do formulário de registro.
     * @param user O objeto User preenchido com os dados do formulário.
     * @return Redireciona para a página de login após o registro bem-sucedido.
     */
    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user, RedirectAttributes redirectAttributes) {
        // Verifica se o username já existe
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            redirectAttributes.addFlashAttribute("error", "O nome de usuário já está em uso. Por favor, escolha outro.");
            return "redirect:/register";
        }

        userService.save(user); // Salva o novo usuário com a senha criptografada.
        redirectAttributes.addFlashAttribute("success", "Registro realizado com sucesso! Faça o login.");
        return "redirect:/login";
    }
}
