package com.springboot.studyjaewon.service.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.studyjaewon.domain.board.Board;
import com.springboot.studyjaewon.domain.board.BoardRepository;
import com.springboot.studyjaewon.web.dto.board.CreateBoardReqDto;
import com.springboot.studyjaewon.web.dto.board.CreateBoardRespDto;
import com.springboot.studyjaewon.web.dto.board.ReadBoardRespDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

	private final BoardRepository boardRepository;
	
	@Override
	public CreateBoardRespDto createBoard(CreateBoardReqDto createBoardReqDto) throws Exception {
		//System.out.println(createBoardReqDto);
		//return true;
		
		Board boardEntity = createBoardReqDto.toEntity();
		
		boolean insertStatus = boardRepository.save(boardEntity) > 0;
		
		return boardEntity.toCreateBoardDto(insertStatus);
		
		//return boardRepository.save(createBoardReqDto.toEntity()) > 0; // DTO to Entity
	}
	
	@Override
	public ReadBoardRespDto readBoard(int boardcode) throws Exception {
		return boardRepository.findBoardByBoardcode(boardcode).toReadBoardDto();
	}

	@Override
	public List<ReadBoardRespDto> readBoardList(int page) throws Exception {
		//List<Board> boardList = boardRepository.getBoardListOfIndex((page - 1) * 10);
		
		List<ReadBoardRespDto> BoardDtoList = new ArrayList<ReadBoardRespDto>();
		
		boardRepository.getBoardListOfIndex((page - 1) * 10).forEach(board -> {
			BoardDtoList.add(board.toReadBoardDto());
		});
		
		return BoardDtoList;
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
