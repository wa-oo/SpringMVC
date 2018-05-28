package com.example;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Controller
public class FormController {
	
	@RequestMapping(value="/form")
	public String add() {
		return "form";
	}
	
	@RequestMapping(value="/success",method=RequestMethod.POST)
	public String doadd(@Validated User user , BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			return "form";
		}
		return "success";
	}
	
}
