package com.springboot.studyjaewon.web.controller.api.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/di")
public class DiController {
	
	// defendency 
	@Autowired // 객체 자동 주입
	@Qualifier("t1")
	private TestInterface testInterface1;

	@Autowired // 객체 자동 주입
	@Qualifier("t2")
	private TestInterface testInterface2;
	
	@GetMapping("/test1")
	public ResponseEntity<?> test1() {
		testInterface1.a();
		testInterface1.b();
		testInterface2.a();
		testInterface2.b();
		return ResponseEntity.ok().body(null);
	}
}
