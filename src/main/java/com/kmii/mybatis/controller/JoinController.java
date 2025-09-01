package com.kmii.mybatis.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kmii.mybatis.dao.OrderDao;

@Controller
public class JoinController {
	
	//꼭 잊지 않고 넣어주기
	@Autowired SqlSession sqlsession;  // DI(pome.xml에 있는 sqlsession 가져오기)
	
	@RequestMapping(value="/userList")
	public String userList(HttpServletRequest request, Model model) {
		
		OrderDao orderDao = sqlsession.getMapper(OrderDao.class);
		model.addAttribute("userList",orderDao.userListDao());
		
		return "userList";
	}
	
	
	@RequestMapping(value="/orderList")
	public String orderList(HttpServletRequest request, Model model) {
		
		OrderDao orderDao = sqlsession.getMapper(OrderDao.class);
		model.addAttribute("orderList",orderDao.orderListDao());
		
		return "orderList";
	}
	
	@RequestMapping(value="/userSearch")
	public String useSearch(HttpServletRequest request, Model model) {
		
		OrderDao orderDao = sqlsession.getMapper(OrderDao.class);
		model.addAttribute("user",orderDao.userSearchDao("hong"));
		
		return "userSearch";
	}
	
	@RequestMapping(value="/userInfo")
	public String userInfo(HttpServletRequest request, Model model) {
		
		OrderDao orderDao = sqlsession.getMapper(OrderDao.class);
		model.addAttribute("userInfo",orderDao.userInfoDao("hong"));
		
		return "userInfo";
	}

	@RequestMapping(value="/userInfo2")
	public String userInfo2(HttpServletRequest request, Model model) {
		
		OrderDao orderDao = sqlsession.getMapper(OrderDao.class);
		model.addAttribute("userDto",orderDao.userInfoMapDao("hong"));
		
		return "userInfo2";
	}

}
