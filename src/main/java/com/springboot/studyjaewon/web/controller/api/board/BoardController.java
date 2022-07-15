package com.springboot.studyjaewon.web.controller.api.board;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studyjaewon.service.board.BoardService;
import com.springboot.studyjaewon.web.dto.board.CreateBoardReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor				// IoC
public class BoardController {

	private final BoardService boardService;
	
	// 게시글 작성
//	public ResponseEntity<?> addBoard(String title, int usercode, String content) {	
//		//@RequestParam("title") String title
//		//@RequestParam String title
//		//키명과 변수명이 같을때 생략가능
//		
//		System.out.println("게시글 작성 요청");
//		System.out.println("title : " + title);
//		System.out.println("usercode : " + usercode);
//		System.out.println("content : " + content);
//		return ResponseEntity.ok().body("test");
//
//		//		HttpHeaders headers = new HttpHeaders();
////		headers.set("Content-Type","text/html;charset=utf-8");
//		
//		//return ResponseEntity.ok().headers(headers).body("test"); // ->밑에와 같은거
////		return new ResponseEntity<>(title + " 게시글 작성 성공", headers, HttpStatus.BAD_REQUEST);
//	}
//	
//	// 게시글 작성
//	@PostMapping("/content")
//	public ResponseEntity<?> addBoard(CreateBoardReqDto createBoardReqDto) {	
//		
//		System.out.println("게시글 작성 요청");
//		System.out.println("title : " + createBoardReqDto.getTitle());
//		System.out.println("usercode : " + createBoardReqDto.getUsercode());
//		System.out.println("content : " + createBoardReqDto.getContent());
//		return ResponseEntity.ok().body("test");
//	}
	// 게시글 작성
	@PostMapping("/content")			//아래에 @RequestBody는 JSON을 받을때만 넣어준다 
	public ResponseEntity<?> addBoard(@RequestBody CreateBoardReqDto createBoardReqDto) {	
		boolean responseData = false;
		try {
			responseData = boardService.createBoard(createBoardReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(responseData);
		}
		return ResponseEntity.ok().body(responseData);
	}

	// 게시글 조회
	
	// 게시글 수정
	
	// 게시글 삭제
}
