package com.springboot.studyjaewon.web.dto.board;

import com.springboot.studyjaewon.domain.board.Board;

import lombok.Data;

@Data
public class CreateBoardReqDto {
	private String title;
	private int usercode;
	private String Content;

	public Board toEntity() {
		return Board.builder()
				.title(title)
				.usercode(usercode)
				.content(Content)
				.build();
	}
}