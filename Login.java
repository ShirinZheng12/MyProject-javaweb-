package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import com.neuq.bean.Manager;
import com.neuq.bean.Student;
import com.neuq.bean.Teacher;
import com.neuq.dao.I.ManagerInterfaceDao;
import com.neuq.dao.I.TeacherInterfaceDao;
import com.neuq.dao.Impl.ManagerInterfaceImplDao;
import com.neuq.dao.Impl.TeacherInterfaceImplDao;
import com.neuq.service.I.StudentInterfaceBiz;
import com.neuq.service.Impl.StudentInterfaceImplBiz;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
	}

	public void destroy() {
		super.destroy();

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ����doPost����
		this.doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ���ServletContext����

		String uname = request.getParameter("username");
		String upsw = request.getParameter("password");
		String message1 = null;
		String message2 = null;
		StudentInterfaceBiz service = new StudentInterfaceImplBiz();
		TeacherInterfaceDao tea = new TeacherInterfaceImplDao();
		ManagerInterfaceDao man = new ManagerInterfaceImplDao();
		// �û���¼
		Student stu = null;
		Teacher te = null;
		Manager ma = null;
		int r = 0;
		try {
			System.out.println("�������е�¼���");
			stu = service.login(uname, upsw);
			te = tea.login(uname, upsw);
			ma = man.login(uname, upsw);
			System.out.println("��¼������,������ת");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (stu != null) {
			r = stu.getRu();
			System.out.print(r);
			// ��¼�ɹ��󣬾ͽ��û��洢��session��
			Cookie c1 = new Cookie("username", uname);
			Cookie c2 = new Cookie("password", upsw);
			response.addCookie(c1);
			response.addCookie(c2);
		} else if (te != null) {
			r = te.getRu();
			System.out.print(r);
		} else if (ma != null) {
			r = ma.getRu();
			System.out.print(r);
		} else {
			message1 = String.format("�Բ����û������������󣡣������µ�¼��2���Ϊ���Զ�������¼ҳ�棡");

			message2 = String.format("<meta http-equiv='refresh' content='2;url=%s'",
					request.getContextPath() + "/login.jsp");
			request.setAttribute("message1", message1);
			request.setAttribute("message2", message2);
			request.getRequestDispatcher("/message.jsp").forward(request, response);
			return;
		}

		System.out.println("aaaaaaaaaaaaa");

		if (r == 1) {
			// ��������Ա����
			message1 = String.format("����Ա��½�ɹ���");
			message2 = String.format("<meta http-equiv='refresh' content='0;url=%s'",
					request.getContextPath() + "/manager/index.jsp");
			request.getSession().setAttribute("Manager", ma);

		} else if (r == 2) {
			// ������ʦ����
			message1 = String.format("��ʦ��½�ɹ���");
			message2 = String.format("<meta http-equiv='refresh' content='0;url=%s'",
					request.getContextPath() + "/teacher/index.jsp");

			request.getSession().setAttribute("Teacher", te);
		} else if (r == 3) {
			System.out.println(stu.toString());
			
			message1 = String.format("�γ̸����˵�½�ɹ���");
			message2 = String.format("<meta http-equiv='refresh' content='0;url=%s'",
					request.getContextPath() + "/student/index.jsp");

			request.getSession().setAttribute("Student", stu);
		}

		request.setAttribute("message2", message2);
		request.setAttribute("message1", message1);
		request.getRequestDispatcher("/message.jsp").forward(request, response);
	}

}
