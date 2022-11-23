package com.Wecoodee.NewDummyProject.dto;

public class ApiResponse<T> {

	private int status;

	private String message;

	private T data;

	public ApiResponse(ResponseStatusCode status, String message, T data) {
		super();
		this.status = status.getStatus();
		this.message = message;
		this.data = data;
	}

	public ApiResponse() {
	}

	public static <T> ApiResponse<T> success(String message, T data) {
		return new ApiResponse<T>(ResponseStatusCode.SUCCESS, message, data);
	}

	public static <T> ApiResponse<T> failure(String message) {
		return new ApiResponse<T>(ResponseStatusCode.FAILED, message, null);
	}

//    public static <T> ApiResponse<T> warning(String message) {
//        return new ApiResponse<T>(ResponseStatusCode.WARNING, message, null);
//    }

	public static <T> ApiResponse<T> warning(String message, T data) {
		return new ApiResponse<T>(ResponseStatusCode.WARNING, message, data);
	}

	public static <T> ApiResponse<T> failure(String message, T data) {
		return new ApiResponse<T>(ResponseStatusCode.FAILED, message, data);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int string) {
		this.status = string;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}



	@Override
	public String toString() {
		return "ApiResponse [status=" + status + ", message=" + message + ", data=" + data + "]";
	}

}
