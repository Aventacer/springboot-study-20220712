package com.springboot.studyjaewon.service.board;

import com.springboot.studyjaewon.web.dto.board.CreateBoardReqDto;

public interface BoardService {
	public boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
	//public boolean readBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
	public boolean updateBoard(int boardcode, CreateBoardReqDto updateBoardReqDto) throws Exception;
	public boolean deleteBoard(int boardcode) throws Exception;
}
