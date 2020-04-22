package com.teams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.teams.service.ProductSjService;
import com.teams.pojo.D_file;
@Controller
public class ProductSjController {
	@Autowired
ProductSjService servic;
}
