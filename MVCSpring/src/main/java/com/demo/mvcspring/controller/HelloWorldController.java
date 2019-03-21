package com.demo.mvcspring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.demo.mvcspring.model.Person;
import com.demo.mvcspring.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloWorldController {
//	@RequestMapping("/admin")
	//su dung bean Person trong Controller
	@Autowired
	@Qualifier("person")
	private Person person;
	//khi go duong dan vao URL: thi no la phuong thuc GET
	@RequestMapping(value= {"/hello","/say/hello","/hello1"}, method= RequestMethod.GET)
    public String hello(Model model) {
        //model.addAttribute("greeting", "Hello Spring MVC");
		//truyen 1 doi tuong 
        model.addAttribute("person",person);
        return "helloworld";
        
    }
	
	//tao requestMapping voi nhieu duong dan khac nhau cung tra ve 1 gia tri
    //cac phuong co gia tri value chi duoc su dung cho phuong thuc GET
	
	//cách khác đe requestMap
	@RequestMapping("/helloDay2")
	public ModelAndView sayHello(HttpServletRequest request,
		@RequestParam(name="user",required= true) String username,
		@RequestHeader(name="content-type", required=false) String contentType) {
		//required =true , Bat buoc phai co trong Request Client, 
		//request.setAttribute("person", person);
		//bien username co gia tri bang gia tri getParameter gui len tu client co parameter name ='user'
		request.setAttribute("greeting", username);
		return new ModelAndView("helloworld");
		
	}
	//Tât ca duong dan ben trong class duoc bat dau /admin
	
	@RequestMapping("/helloMVC/{name}")
   public String hello(HttpServletRequest request,
		   @PathVariable(value="name") String name) {
	   request.setAttribute("greeting", name);
	   return "helloworld";
   }
	//goi for them nguoi dung
	@RequestMapping(value="/addUser", method=RequestMethod.GET)
	   public String addUser(HttpServletRequest request){
		  User user = new User();
		  
		  List<String>favorites= new ArrayList<String>();
		  favorites.add("Xem Phim");
		  favorites.add("Nghe nhac");
		  favorites.add("Coding");
		  
		  user.setName("Spring");
		request.setAttribute("user", user);
		//request.setAttribute("list", favorites);
		   return "addUser";
	   }
	//Controller xu ly su kien submit form, đoi tuong user duoc khoi tao
	//va gan gia tri tu form gui len thong qua modelAttribute
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	   public String addUser(HttpServletRequest request,
			   @ModelAttribute("user") User user){
//		  User user = new User();
//		  user.setName("Spring");
		request.setAttribute("user", user);
		   return "viewUser";
	   }
	
}
