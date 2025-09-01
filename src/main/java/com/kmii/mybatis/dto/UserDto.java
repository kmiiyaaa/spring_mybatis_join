package com.kmii.mybatis.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {
	
	private String userid;
	private String username;
	
	private UserInfoDto userInfo; //유저의 세부 정보를 멤버로 저장(1:1관계)
	
	private List<OrderDto> orderDtos;  // 유저가 주문한 주문리스트(1:n관계)(회원 1명(당) : 주문 여러개)

}
