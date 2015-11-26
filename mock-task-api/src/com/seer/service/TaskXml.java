package com.seer.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

public class TaskXml extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("application/xml; charset=utf-8");
		
		InputStream payloadStream = this.getClass().getClassLoader().getResourceAsStream("test-get-xml.txt");
		String payload = IOUtils.toString(payloadStream);
		
		PrintWriter out = resp.getWriter();
		out.println(payload);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("application/xml; charset=utf-8");
		
		InputStream payloadStream = this.getClass().getClassLoader().getResourceAsStream("test-post-xml.txt");
		String payload = IOUtils.toString(payloadStream);
		
		PrintWriter out = resp.getWriter();
		out.println(payload);
	}

}
