package com.first.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.first.board.domain.BoardDTO;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface BoardMapper {

    public int insertBoard(BoardDTO params);

    public BoardDTO selectBoardDetail(Long idx);

    public int updateBoard(BoardDTO params);

    public int deleteBoard(Long idx);

    public List<BoardDTO> selectBoardList();

    public int selectBoardTotalCount();

}