package cn.wizool.schooltimetable.basicmanager.classroom;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wizool.schooltimetable.utils.ResponseUtils;

/**
 * Servlet implementation class ClassroomListServlet
 */
@WebServlet(description = "教师列表", urlPatterns = { "/ClassroomListServlet" })
public class ClassroomListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassroomListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String a="[  \r\n" + 
				"  {  \r\n" + 
				"    \"id\": 1,  \r\n" + 
				"    \"pid\": 0,  \r\n" + 
				"    \"name\": \"系统管理\",  \r\n" + 
				"    \"referred\": \"管理\"  \r\n" + 
				"  },  \r\n" + 
				"  {  \r\n" + 
				"    \"id\": 2,  \r\n" + 
				"    \"pid\": 0,  \r\n" + 
				"    \"name\": \"字典管理\",  \r\n" + 
				"    \"referred\": \"字典\"  \r\n" + 
				"  },  \r\n" + 
				"  {  \r\n" + 
				"    \"id\": 20,  \r\n" + 
				"    \"pid\": 1,  \r\n" + 
				"    \"name\": \"新增系统\",  \r\n" + 
				"    \"referred\": \"新增\"  \r\n" + 
				"  },  \r\n" + 
				"  {  \r\n" + 
				"    \"id\": 21,  \r\n" + 
				"    \"pid\": 1,  \r\n" + 
				"    \"name\": \"编辑系统\",  \r\n" + 
				"    \"referred\": \"编辑\"  \r\n" + 
				"  },  \r\n" + 
				"  {  \r\n" + 
				"    \"id\": 22,  \r\n" + 
				"    \"pid\": 1,  \r\n" + 
				"    \"name\": \"删除系统\",  \r\n" + 
				"    \"referred\": \"删除\"  \r\n" + 
				"  },  \r\n" + 
				"  {  \r\n" + 
				"    \"id\": 33,  \r\n" + 
				"    \"pid\": 2,  \r\n" + 
				"    \"name\": \"系统环境\",  \r\n" + 
				"    \"referred\": \"环境\"  \r\n" + 
				"  },  \r\n" + 
				"  {  \r\n" + 
				"    \"id\": 333,  \r\n" + 
				"    \"pid\": 33,  \r\n" + 
				"    \"name\": \"新增环境\",  \r\n" + 
				"    \"referred\": \"新增\"  \r\n" + 
				"  },  \r\n" + 
				"  {  \r\n" + 
				"    \"id\": 3333,  \r\n" + 
				"    \"pid\": 33,  \r\n" + 
				"    \"name\": \"编辑环境\",  \r\n" + 
				"    \"referred\": \"编辑\"  \r\n" + 
				"  },  \r\n" + 
				"  {  \r\n" + 
				"    \"id\": 233332,  \r\n" + 
				"    \"pid\": 33,  \r\n" + 
				"    \"name\": \"删除环境\",  \r\n" + 
				"    \"referred\": \"删除\"  \r\n" + 
				"  }  \r\n" + 
				"]  ";
		ResponseUtils.renderJson(response, a);
	}


}
