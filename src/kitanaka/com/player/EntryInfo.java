package kitanaka.com.player;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kitanaka.com.flayer.EditAikidoDb;

/**
 * Servlet implementation class EntryInfo
 */
@WebServlet("/EntryInfo")
public class EntryInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EntryInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			//リクエストに入っている値のエンコード
			request.setCharacterEncoding( "UTF-8" ) ;
			//表示する際のエンコード
			response.setContentType("text/html; charset=UTF-8");
			//リクエストから入力項目を取得
			String name = (String) request.getParameter("name");
			String year = (String) request.getParameter("year");
			String password = (String) request.getParameter("password");

			System.out.println("氏名"+name);
			System.out.println("代"+year);
			System.out.println("パスワード"+password);
			
			//メンバ情報編集クラス呼び出し
			EditAikidoDb ead = new EditAikidoDb();
			//メンバ情報登録メソッド呼び出し
			ead.entryAikidoMember(name, year, password);
			
			ServletContext sc = getServletContext();
			sc.getRequestDispatcher("/EntryScreen.jsp").forward(request, response);;
		}catch(SQLException e){
			ServletContext sc = getServletContext();
			sc.getRequestDispatcher("/EntryScreen.jsp");
		}
		
		
		
	}

}
