package ecp.base;

import java.io.Serializable;

/**
 * 响应结果
 * @author pengsn
 */
public class Result implements Serializable{
	
	/**
	 * 状态码
	 */
	private int code;
	
	/**
	 * 消息
	 */
	private String msg;
	
	/**
	 * 结果集
	 */
	private Object data;
	
	/**
	 * 结果成功与否
	 */
	private boolean success = false;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Result()
	{
		
	}
	
	public Result(int code)
	{
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	

}
