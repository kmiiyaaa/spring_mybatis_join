package com.kmii.mybatis.dto;

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

}
