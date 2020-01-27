package com.RJ45.demo.controllers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.RJ45.demo.model.Operations;


@RestController
public class ControllerCalculator {

	 @RequestMapping("/")
	 public   String hellow() 
	    {
	        return "Calculadora!!";
	    }
	 
	@PostMapping("/sumar")
	 public int sumar( int numero1, int numero2)
	 	{
		
			Operations opsuma = new Operations();
	  		return opsuma.sumar(numero1, numero2);
		 
	 	}
	
	@PostMapping("/restar")
	 public int restar( int numero1, int numero2)
	 	{
		
			Operations opsuma = new Operations();
	  		return opsuma.restar(numero1, numero2);
		 
	 	}
	
	@PostMapping("/multiplicar")
	 public int multiplicar( int numero1, int numero2)
	 	{
		
			Operations opsuma = new Operations();
	   		return opsuma.multiplicar(numero1, numero2);
		 
	 	}
	
	@PostMapping("/dividir")
	 public double dividir( int numero1, int numero2)
	 	{
		
			Operations opsuma = new Operations();
	  		return opsuma.dividir(numero1, numero2);
		 
	 	}
	 
	 }
	 
	 

