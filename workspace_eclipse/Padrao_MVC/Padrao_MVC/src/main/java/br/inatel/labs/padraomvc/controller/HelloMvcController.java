/**
 * Controlador responsável por manipular solicitações relacionadas ao recurso "hello".
 */
package br.inatel.labs.padraomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloMvcController {

    /**
     * Manipula solicitações HTTP GET para o recurso "hello".
     *
     * @param model O modelo utilizado para passar dados para a visão.
     * @return O nome da visão a ser renderizada ("hello-mvc").
     */
    @GetMapping("/hello")
    public String getHello(Model model) {
        // Nome do usuário a ser exibido na visão
        String nomeUsuario = "Samuel Freitas";
        
        // Adiciona o nome do usuário ao modelo
        model.addAttribute("usuario", nomeUsuario);
        
        // Retorna o nome da visão a ser renderizada
        return "hello-mvc";
    }
}
