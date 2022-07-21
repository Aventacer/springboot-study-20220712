package com.springboot.studyjaewon.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CMRespDTO<T> {
	private int code;
	private String message;
	private T data;
}
