package org.vetkimlik.bean;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HataController {

		@ExceptionHandler(Exception.class)
		public String hatayaGit(Exception hata, Model model)
		{
			
			
			return "hataSayfasi";
		}
	
}
