package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springmvcsearch.service.StudentService;
import springmvcsearch.model.Student;

@Controller
public class FormController {

	private StudentService studentService;
	
	@RequestMapping("/complex")
	public String showForm()
	{
		return "complex_form";
	}
	
	@RequestMapping(path = "handleform", method = RequestMethod.POST)
	public String formHandle(@ModelAttribute("student") Student student, Model model)
	{
		this.studentService.createUser(student);
		
		return "success";
	}
	
}
