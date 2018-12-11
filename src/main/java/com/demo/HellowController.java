package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lee
 * 2018年12月7日
    * 测试Spring Boot控制器
 */
@RestController
@RequestMapping("test")
public class HellowController {
	
	@RequestMapping("hellow")
	public String hellow() {
		return "Hellow Spring Boot!";
	}
	
	@RequestMapping("world")
	public String world() {
		return "Hellow World!";
	}
}
