package com.voya.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.voya.model.Usuario;
import com.voya.repository.UsuarioRepository;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("usuario/listar.html");
 
		List<Usuario> usuarios = usuarioRepository.findAll();
		modelAndView.addObject("usuarios", usuarios);
 
		return modelAndView;
	}
	
	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("usuario/cadastro");
 
		modelAndView.addObject("usuario", new Usuario());
 
		return modelAndView;
	}
	
	@PostMapping("/cadastrar")
	public ModelAndView cadastrar(Usuario usuario) throws IOException {

		ModelAndView modelAndView = new ModelAndView("redirect:/usuario");
 
		usuarioRepository.save(usuario);
 
		return modelAndView;
	}
	
	
	@GetMapping("/{id}/editar")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("usuario/edicao");
 
		Usuario usuario = usuarioRepository.getReferenceById(id);
		modelAndView.addObject("usuario", usuario);
 
		return modelAndView;
	}
	
	@PostMapping("/{id}/editar")
	public ModelAndView editar(Usuario usuario) {	
		
		usuarioRepository.save(usuario);
		ModelAndView modelAndView = new ModelAndView("redirect:/usuario");
 
		return modelAndView;
	}
	
	@GetMapping("/{id}/excluir")
	public ModelAndView excluir(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("redirect:/usuario");
 
		usuarioRepository.deleteById(id);
 
		return modelAndView;
	}

}
