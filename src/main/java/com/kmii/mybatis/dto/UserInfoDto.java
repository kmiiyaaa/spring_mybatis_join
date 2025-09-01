package com.kmii.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserInfoDto {
	
	private String userid; // 기본키
	private String useraddress;
	private String userphone;

}
