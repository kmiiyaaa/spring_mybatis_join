package com.kmii.mybatis.dao;

import java.util.List;

import com.kmii.mybatis.dto.OrderDto;
import com.kmii.mybatis.dto.UserDto;
import com.kmii.mybatis.dto.UserIdInfoDto;

public interface OrderDao {
	
	
	// 모든 주문 리스트 가져오기
	public List<OrderDto> orderListDao();
	
	//모든 고객 리스트
	public List<UserDto> userListDao();
	
	// 특정 유저 아이디로 회원 가져오기
	public UserDto userSearchDao(String userid); 
	
	// 특정 유저 아이디로 유저의 회원 세부 정보 가져오기 
	public UserIdInfoDto userInfoDao(String userid);
	
	// userInfoDao를 spring framework형식으로 수정
	public UserDto userInfoMapDao(String userid);
	

}
