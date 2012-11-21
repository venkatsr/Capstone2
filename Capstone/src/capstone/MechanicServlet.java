package capstone;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MechanicServlet
 */
@WebServlet("/MechanicServlet")
public class MechanicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String userType, userName, password, retypePass, emailAddy, firstName,
			lastName, address, city, province, postalCode, phone, fax;
	int i = 0;
	ArrayList<UserInfo> newUserList = new ArrayList<UserInfo>();
	HttpSession session;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MechanicServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		if (request.getParameter("submit") != null)
			response.sendRedirect("http://localhost:8080/Capstone/mech_view.jsp");

		else if (request.getParameter("vehicleButton") != null)
			response.sendRedirect("http://localhost:8080/Capstone/add_edit.jsp");

		else if (request.getParameter("changeVehicle") != null)
			response.sendRedirect("http://localhost:8080/Capstone/mech_view.jsp");

		else if (request.getParameter("checkSubmit") != null)
			response.sendRedirect("http://localhost:8080/Capstone/Vehicle_Invoice.jsp");

		else if (request.getParameter("createUser") != null) {
			userType = request.getParameter("userTypeDD");
			userName = request.getParameter("userName");
			password = request.getParameter("password");
			retypePass = request.getParameter("retypePass");
			emailAddy = request.getParameter("emailAddy");
			firstName = request.getParameter("firstName");
			lastName = request.getParameter("lastName");
			address = request.getParameter("address");
			city = request.getParameter("city");
			province = request.getParameter("province");
			postalCode = request.getParameter("postalCode");
			phone = request.getParameter("phone");
			fax = request.getParameter("fax");
			i++;
			session = request.getSession(true);

			UserInfo newUser = new UserInfo(i, userType, userName, password,
					retypePass, firstName, lastName, address, province,
					postalCode, city, phone, fax, emailAddy);
			if (!session.isNew()) {
				newUserList = (ArrayList<UserInfo>) session
						.getAttribute("statename");
			} else {
				newUserList = new ArrayList<UserInfo>();
			}
			if (newUserList == null) {
				newUserList = new ArrayList<UserInfo>();
			}
			newUserList.add(newUser);
			session.setAttribute("statename", newUserList);
			session.setAttribute("buttonPressed", "createUser");

			RequestDispatcher rd = request.getRequestDispatcher("newUser.jsp");
			rd.forward(request, response);

		}
	}
}
