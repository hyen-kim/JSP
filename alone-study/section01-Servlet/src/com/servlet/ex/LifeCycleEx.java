package com.servlet.ex;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleEx
 */
@WebServlet("/LifeCycleEx")
public class LifeCycleEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycleEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
	}
	
	
	@Override
	public void destroy() {
		// �ڿ��� �����Ҷ� ���������� �ѹ� ����
		System.out.println("destroy");
	}
	
	@Override
	public void init() throws ServletException {
		// ���� ��û�� ������ �� �� �ѹ� ����
		System.out.println("init");
	}
	
	@PostConstruct
	private void initPostConstruct() {
		// ��ó�� �۾� -> init �޼ҵ� ���� ����
		System.out.println("initPostConstruct");
	}
	
	@PreDestroy
	private void destoryPreDestory() {
		// ��ó�� �۾� -> destory �� �Ŀ� ����
		System.out.println("destoryPreDestory");
	}
	
	

}
