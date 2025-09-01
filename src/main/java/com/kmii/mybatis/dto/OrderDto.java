package com.kmii.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class OrderDto {
	
	private int orderid;  // 주문번호(기본키)
	private String ordername;  // 주문 제품 이름
	private String userid;   // 주문한 고객 아이디

}
