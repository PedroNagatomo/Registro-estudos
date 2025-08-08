package com.estudos.registro_estudos.controllers;

import com.estudos.registro_estudos.model.Estudo;
import com.estudos.registro_estudos.repositories.EstudoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/estudos")
public class EstudoController {

    private final EstudoRepository estudoRepository;

    public EstudoController(EstudoRepository estudoRepository) {
        this.estudoRepository = estudoRepository;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("estudos", estudoRepository.findAll());
        return "estudos/lista";
    }

    @PostMapping
    public String salvar(@ModelAttribute Estudo estudo) {
        estudoRepository.save(estudo);
        return "redirect:/estudos";
    }

    @GetMapping("/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Estudo estudo = estudoRepository.findById(id).orElseThrow();
        model.addAttribute("estudo", estudo);
        return "estudos/editar";
    }

    @PostMapping("/{id}")
    public String atualizar(@PathVariable Long id, @ModelAttribute Estudo estudoAtualizado) {
        Estudo estudo = estudoRepository.findById(id).orElseThrow();
        estudo.setTitulo(estudoAtualizado.getTitulo());
        estudo.setDescricao(estudoAtualizado.getDescricao());
        estudoRepository.save(estudo);
        return "redirect:/estudos";
    }

    @PostMapping("/{id}/excluir")
    public String excluir(@PathVariable Long id) {
        estudoRepository.deleteById(id);
        return "redirect:/estudos";
    }
}
