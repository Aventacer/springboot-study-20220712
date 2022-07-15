package com.springboot.studyjaewon.service.board;

import org.springframework.stereotype.Service;

import com.springboot.studyjaewon.domain.board.BoardRepository;
import com.springboot.studyjaewon.web.dto.board.CreateBoardReqDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

	private final BoardRepository boardRepository;
	
	@Override
	public boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception {
		//System.out.println(createBoardReqDto);
		//return true;
		return boardRepository.save(createBoardReqDto.toEntity()) > 0;
	}

	@Override
	public boolean updateBoard(int boardcode, CreateBoardReqDto updateBoardReqDto) throws Exception {
		
		return false;
	}

	@Override
	public boolean deleteBoard(int boardcode) throws Exception {
		
		return false;
	}
}
