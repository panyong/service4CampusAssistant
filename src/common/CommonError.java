package common;

public enum CommonError {
	
	Course_NOT_FOUND(10001,"未获得该课程"),
	Course_GET_ERROR(10002,"获得课程出错"),
	Course_GET_VERIFYCODE_LACK(10003,"缺少verifyCode参数"),
	Course_GET_PARAM_LACK(10003,"缺少参数");
	
	private int code;
	private String msg;
	public int getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
	private CommonError(int code,String msg) {
		this.code = code;
		this.msg = msg;
	}
	
}
