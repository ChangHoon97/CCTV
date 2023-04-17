package com.firstclass.childrenctv.ReportBoard;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.firstclass.childrenctv.user.UserVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class ReportBoardController {

	private ReportBoardService service;
	
	@GetMapping("/reportBoard/register")
    public String reportboardregister(@RequestParam("child_id") Long child_id, Model model) {
        // child_id 값을 모델에 추가하여 register.jsp로 전달
        model.addAttribute("child_id", child_id);
        return "reportboard/register";
    }
	
	@PostMapping("/reportBoard/register")
	public String reportboardregister(ReportBoardVO board, HttpServletRequest request) {
		board.setUser_id(20L);
		/* 세션에서 유저 정보를 받아오는 부분 세션 받아올시 윗줄 삭제요망
		 * HttpSession userSession = request.getSession(); 
		 * UserVO userInfo = (UserVO)
		 * userSession.getAttribute("user"); 
		 * board.setUser_id(userInfo.getUser_id());
		 */
		System.out.println("넣는 정보는 무엇일까????" +board.toString());
		service.insert(board);
		
		return "redirect:/reportBoard/list?child_id=" + board.getChild_id();
	}
	
	@PostMapping("/reportBoard/delete")
	public String deleteReportBoard(Long report_id, @RequestParam("child_id") Long child_id) {
	    service.deleteReportBoard(report_id);
	    return "redirect:/reportBoard/list?child_id=" + child_id;
	}

	
	@GetMapping("/reportBoard/get")
	public String get(@RequestParam("report_id") Long report_id, Model model) {
		model.addAttribute("board", service.get(report_id));
		System.out.println("GET 컨트롤러 들어왔다!!!!!!!!!!");
		if(service.get(report_id) != null) {
			return "reportboard/get";
		}
		else {
			return "redirect:/";
		}
	}
	
	@GetMapping("/reportBoard/list")
	public String list(@RequestParam("child_id") Long child_id, Model model) {
		
		model.addAttribute("list", service.getByChild(child_id));
		model.addAttribute("child_id", child_id);
		System.out.println("LIST 컨트롤러 들어왔다!!!!!!!!!!!!!");
		return "reportboard/list";
		
	}
	
	@GetMapping("/reportBoard/update")
	public String update(@RequestParam("report_id") Long reportboard_id, Model model) {
	    // reportboard_id를 사용하여 해당 보고서 정보를 가져와서 update.jsp 화면에 전달
	    ReportBoardVO board = service.get(reportboard_id);
	    System.out.println("어떤 정보를 가져왔을까????????" + board);
	    model.addAttribute("board", board);
	    return "reportboard/update";
	}
	
	@PostMapping("/reportBoard/update")
	public String update(ReportBoardVO board, @RequestParam("child_id") Long child_id) {
		System.out.println("넣는 정보는 무엇일까????" +board.toString());
		service.update(board);
		return "redirect:/reportBoard/list?child_id=" + child_id;
		
	}
	
	/*
	 * @GetMapping("/reportBoard/get") //public String
	 * get(@RequestParam("report_id") Long report_id, Model model) { //public String
	 * get(Long report_id) { //model.addAttribute("board", service.get(report_id));
	 * 
	 * List<ReportBoardVO> boards = service.get(report_id);
	 * 
	 * System.out.println("컨트롤러 들어왔다!!!!!!!!!!" + boards.get(0)); return
	 * "reportboard/get"; }
	 */

}
