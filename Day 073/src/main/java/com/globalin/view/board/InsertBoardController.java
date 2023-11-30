package com.globalin.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.globalin.biz.board.BoardVO;
import com.globalin.biz.board.impl.BoardDAO;

public class InsertBoardController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글 등록 처리");
		// 1. 사용자 입력 정보 추출
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		// 2. 데이터베이스 연동 처리
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		
		BoardDAO dao = new BoardDAO();
		dao.insertBoard(vo);
		// 3. 화면 네비게이션
//		return "getBoardList.do";
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:getBoardList.do");
		return mav;
	}
}