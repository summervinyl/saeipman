package com.saeipman.app.minwon.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MinwonVO {
	private Integer postNo; // 민원글번호
	private String title;
	private String content;
	private String category;
	private String chumbuImage; // 첨부이미지
	private String roomNo; // 방번호
	private Integer acceptState; // 처리상태

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date visitsDate; // 방문일자
	private Date regDate; // 작성일자
	private Date modDate; // 수정일자
	private Integer alertType; //알림유형
	private String roomId; //방 아이디
}
