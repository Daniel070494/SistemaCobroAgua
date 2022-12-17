package com.cobroAgua.web.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value = {"/login"}, method = RequestMethod.GET)
	public ModelAndView login() {
		
		ModelAndView mv = new ModelAndView("login");
		

		mv.addObject("nombre", "Daniel");
		
		return mv;
	}

	  @RequestMapping(value="/validaLogin", method=RequestMethod.POST)
	  public ModelAndView alEnviar(HttpServletRequest request, Model model,
			  @RequestParam(value="usuario",required=true) String usuario,
			  @RequestParam(value="password",required=true) String password,
			  @RequestParam(value="rol",required=true) String rol){
		
		  
		  
		  return null;
	}
	  
}
