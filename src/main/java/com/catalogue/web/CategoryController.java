package com.catalogue.web;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/categories")
@Api(value="Manage Category Object", tags = { "catalog"})
public class CategoryController {
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping("hello")
	@ApiOperation(value="Returns a localized hello world")
	public String helloworld() {
		return messageSource.getMessage("hello.message", null, 
				LocaleContextHolder.getLocale());
	}
}
