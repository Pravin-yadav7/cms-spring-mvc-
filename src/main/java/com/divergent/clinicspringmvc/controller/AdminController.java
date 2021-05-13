package com.divergent.clinicspringmvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.divergent.clinicspringmvc.service.AdminService;


@Controller
@RequestMapping("/adminController")
public class AdminController  {

	private static final long serialVersionUID = 1L;

	@Autowired
	private AdminService adminService;

	public AdminController() {
		super();
	}

	@PostMapping
	protected String check(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (adminService.login(username, password)) {
			return "redirect:/AdminHome.jsp";
		} else {
			request.setAttribute("error", "Incorrect Username & Password");
			return "redirect:/index.jsp";
		}

	}

}
