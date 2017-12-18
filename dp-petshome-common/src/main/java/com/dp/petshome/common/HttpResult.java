package com.dp.petshome.common;

import java.util.Map;
import java.util.TreeMap;

public class HttpResult<T> {
	/**
	 * 是否成功标识0:成功；1：失败
	 */
	private int status;
	/**
	 * 消息code
	 */
	private String errorCode;
	/**
	 * 消息内容
	 */
	private String msg;
	/**
	 * 数据
	 */
	private T result;

	private Map<String, Object> body = new TreeMap<String, Object>();

	/** 请求ID，透传参数，用于跟踪请求响应过程  */
	private String requestId;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public Map<String, Object> getBody() {
		return body;
	}

	public void setBody(Map<String, Object> body) {
		this.body = body;
	}

	public HttpResult() {
	}

	public HttpResult(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	/** 存入结果键值对，支持流式调用  */
	public HttpResult<T> put(String key, Object value) {
		this.body.put(key, value);
		return this;
	}

	/** 
	 * 存入非空字符串结果键值对，支持流式调用 
	 */
	public HttpResult<T> putString(String key, Object value) {
		value = value == null ? "" : value;
		this.body.put(key, value);
		return this;
	}

	public void putAll(Map<? extends String, ? extends Object> map) {
		if (map != null && !map.isEmpty()) {
			this.body.putAll(map);
		}
	}

	public void putResult(String resultKey, HttpResult<?> srt) {
		if (srt != null) {
			this.msg = srt.getMsg();
			this.status = srt.getStatus();
			this.errorCode = srt.getErrorCode();
			this.put(resultKey, srt.getResult());
		}
	}

}
