package codegymdanag.spring.jdbc.controller;

import codegymdanag.spring.dao.CustomerDAO;
import codegymdanag.spring.service.CustomerServiceImpl;
import codegymdanag.spring.service.CustomerServiceImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import codegymdanag.spring.model.Customer;
import codegymdanag.spring.service.CustomerService;

@Controller
public class MainController {


	@Autowired
	CustomerDAO customerDAO;
	
	@RequestMapping("/jdbc")
	public ModelAndView  getDay04Massage(Model model) {


		Customer customer01 = customerDAO.findByCustomerFirstName("Le");
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("finded", customer01);
		System.out.println(customer01.getLastName());
		return modelAndView;
	}
}
