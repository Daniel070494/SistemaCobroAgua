package com.cobroAgua.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cobroAgua.web.app.Model.Usuario;
import com.cobroAgua.web.app.Service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	@Qualifier("usuarioServiceImpl")
	private UsuarioService usuarioService;

	@RequestMapping(value = {"/index", "/", "/home"}, method = RequestMethod.GET)
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("index");
		
		
		List<Usuario> lista = new ArrayList();
		

		lista = usuarioService.getUsuarios();
		
		mv.addObject("titulo", "Sistema de cobro de agua potable");
		mv.addObject("lista", lista);
		
		return mv;
	}
}
