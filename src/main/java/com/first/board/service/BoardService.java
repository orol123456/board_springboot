package com.first.board.service;
import java.util.List;

import com.first.board.domain.BoardDTO;

public interface BoardService {

    public boolean registerBoard(BoardDTO params);

    public BoardDTO getBoardDetail(Long idx);

    public boolean deleteBoard(Long idx);

    public List<BoardDTO> getBoardList();

}
