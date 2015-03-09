package utils;

import common.CommonError;

import dto.BaseDto;

public class DtoUtils {
	public static <T> BaseDto<T> dto(CommonError error,T t) {
		BaseDto<T> dto = new BaseDto<T>();
		dto.setCode(error.getCode());
		dto.setMsg(error.getMsg());
		dto.setData(t);
		return dto;
	}
	
	public static <T> BaseDto<T> dto(CommonError error) {
		BaseDto<T> dto = new BaseDto<T>();
		dto.setCode(error.getCode());
		dto.setMsg(error.getMsg());
		dto.setData(null);
		return dto;
	}
	
	public static <T> BaseDto<T> ok() {
		BaseDto<T> dto = new BaseDto<T>();
		dto.setCode(200);
		dto.setMsg("success");
		dto.setData(null);
		return dto;
	}
	
	public static <T> BaseDto<T> ok(T t) {
		BaseDto<T> dto = new BaseDto<T>();
		dto.setCode(200);
		dto.setMsg("success");
		dto.setData(t);
		return dto;
	}
}
