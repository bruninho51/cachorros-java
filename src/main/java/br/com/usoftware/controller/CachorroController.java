package br.com.usoftware.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.usoftware.model.CachorroModel;

@Controller
@RequestMapping("/cachorros")
public class CachorroController {

	@GetMapping()
	public String findAll(Model model) { // Listagem
		
		return null;
	}
	
	@GetMapping("/{id}")
	public String findById(@PathVariable("id") Long id, Model model) { // Detalhes
		
		return null;
	}
	
	@PostMapping()
	public String create(@Valid CachorroModel cachorro, BindingResult bindingRes, RedirectAttributes redirectAttr) { // Cadastro
		
		return null;
	}
	
	@PutMapping(value = "/{id}")
	public String update(@Valid CachorroModel cachorro, BindingResult bindingRes, RedirectAttributes redirectAttr, @PathVariable("id") Long id) { // Atualização
		
		return null;
	}
	
	@DeleteMapping(value = "/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		
		return null;
	}
	
	@PostMapping("/form")
	public String form(
			@RequestParam String page, 
			@RequestParam(required = false) Long id, 
			@ModelAttribute("cachorroModel") CachorroModel cachorroModel, 
			Model model) {
		
		return null;
	}
	
}
