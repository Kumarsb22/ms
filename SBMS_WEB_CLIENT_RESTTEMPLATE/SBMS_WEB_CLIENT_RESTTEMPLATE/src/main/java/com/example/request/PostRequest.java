package com.example.request;

public class PostRequest {
	private Integer userId;
	
	private String title;
	private String body;

	public PostRequest() {
		// TODO Auto-generated constructor stub
	}

	public PostRequest(Integer userId,  String title, String body) {
		super();
		this.userId = userId;
		
		this.title = title;
		this.body = body;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "PostRequest [userId=" + userId +  ", title=" + title + ", body=" + body + "]";
	}

}
