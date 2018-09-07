package com.service;

import com.mode.Request;
import com.mode.Request2;
import com.mode.Response;

public interface LoginService {
	public int login();

	public Response getRes(Request req,Request2 req2);
	
//	public Response getRes2(Request req,Request2 req2);

}
