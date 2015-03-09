package common;

public enum CommonError {
	
	Course_NOT_FOUND(10001,"δ��øÿγ�"),
	Course_GET_ERROR(10002,"��ÿγ̳���"),
	Course_GET_VERIFYCODE_LACK(10003,"ȱ��verifyCode����"),
	Course_GET_PARAM_LACK(10003,"ȱ�ٲ���");
	
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
