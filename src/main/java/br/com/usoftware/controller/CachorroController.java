package br.com.usoftware.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
import br.com.usoftware.repository.CachorroRepository;

@Controller
public class CachorroController {

	@Autowired
	private CachorroRepository cachorroRepository;
	
	@GetMapping("/")
	public String findAll(Model model) { // Listagem
		
		Map<Long, CachorroModel> cachorros = cachorroRepository.findAll();
		
		model.addAttribute("cachorros", cachorros);
		
		return "listagem";
	}
	
	@GetMapping("/{id}")
	public String findById(@PathVariable("id") Long id, Model model) { // Detalhes
		
		model.addAttribute("cachorro", cachorroRepository.findById(id));
		
		return "detalhes_cachorro";
	}
	
	@PostMapping(value = "/")
	public String create(@Valid CachorroModel cachorro, BindingResult bindingRes, RedirectAttributes redirectAttr) { // Cadastro
		
		if (bindingRes.hasErrors()) {
			return "cadastro_cachorro";
		}
		
		cachorroRepository.save(cachorro);
		
		redirectAttr.addFlashAttribute("message", "Cachorro cadastrado com sucesso!");
		
		return "redirect:/";
		
	}
	
	@PutMapping(value = "/{id}")
	public String update(@Valid CachorroModel cachorro, BindingResult bindingRes, RedirectAttributes redirectAttr) { // Atualização
		
		if (bindingRes.hasErrors()) {
			return "editar_cachorro";
		}
		
		cachorroRepository.update(cachorro);
		
		redirectAttr.addFlashAttribute("message", "Cachorro atualizado com sucesso!");
		
		return "redirect:/";
	}
	
	@DeleteMapping(value = "/{id}")
	public String delete(@PathVariable("id") Long id, Model model, RedirectAttributes redirectAttr) {
		
		cachorroRepository.deleteById(id);
		
		redirectAttr.addFlashAttribute("message", "Cachorro apagado com sucesso!");
		
		return "redirect:/";
	}
	
	@GetMapping(value = "/form")
	public String form(
			@RequestParam String page, 
			@RequestParam(required = false) Long id, 
			@ModelAttribute("cachorroModel") CachorroModel cachorroModel, 
			Model model) {
		
		if ("cadastro_cachorro".equals(page)) {
			
			model.addAttribute("id", cachorroRepository.getMax() + 1);
			
			return page;
			
		} else if ("editar_cachorro".equals(page)) {
			
			model.addAttribute("cachorroModel", cachorroRepository.findById(id));
			
			return page;
		}
		
		return "listagem";
	}
	
}
