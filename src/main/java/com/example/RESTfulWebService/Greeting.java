package com.example.RESTfulWebService;

/**
 * Created by lzy on 17-7-19.
 */
public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id,String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
