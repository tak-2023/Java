package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		computationprocess(request,response);	
		request.setCharacterEncoding("UTF-8"); // 文字化け防止		
	}

	private int parseInt(String mojinumber) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	    computationprocess(request,response);	
	}

	public static void computationprocess(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		String mojinumber; // 数字を格納する変数
		int suuchinumber;
		String outputdata;
		// jspから送られてきた値を受け取る
		try {
			mojinumber = request.getParameter("Number"); // 数字の受け取り
			suuchinumber = Integer.valueOf(mojinumber);
			if (suuchinumber % 2 == 0) {
				outputdata = "偶数です。";
			} else {
				outputdata = "奇数です。";
			}
		} catch (NumberFormatException suuchinumber1) {
			outputdata = "数値以外の値が入力されています。半角数値を入力してください";
			request.setAttribute("Outputdata", outputdata);
			// 次の画面に遷移\
			request.getRequestDispatcher("/Eroorpage.jsp").forward(request, response);
		}

		// 次の画面(jsp)に値を渡す
		request.setAttribute("Outputdata", outputdata);
		// 次の画面に遷移\
		request.getRequestDispatcher("/Output.jsp").forward(request, response);
	}
}
