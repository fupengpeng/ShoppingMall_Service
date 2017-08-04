package com.jiudianlianxian.personcenter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.json.JSONException;
//import org.json.JSONObject;





import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.jiudianlianxian.domain.User;
import com.jiudianlianxian.entity.result.LoginResult;
import com.jiudianlianxian.service.UsersService;

/**
 * 
 * Title: Login
 * Description: 登录处理
 * Company: 济宁九点连线信息技术有限公司
 * ProjectName: ShoppingMall
 * @author fupengpeng
 * @date 2017年8月2日 上午11:22:56
 *
 */
//@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int SUCCESS = 0;
	private static final int ERROR = 1;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		// 接收用户提交的用户名和密码
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		
		UsersService usersService = new UsersService();
		User user = new User();
		user.setAccount(account);
		user.setPassword(password);
		LoginResult loginResult;
		
		try {
			if (usersService.checkUser(user)) {
				System.out.println("账号密码匹配，登录成功");
				
				
				loginResult = new LoginResult();
				loginResult.setCode(SUCCESS);
				loginResult.setInfo("info");
				loginResult.setUid("65946516156516514");
				String jsonObject = JSONObject.toJSONString(loginResult);
				
//				JSONObject jsonObject = JSONObject.fromObject(loginResult);
//				
//				String json = "{'code':'"+SUCCESS+"','uid':'100101'}";
//				JSONObject jsonObj = new JSONObject(json);
//				String name = jsonObj.getString("code");
//				 
//				System.out.println(jsonObj);
//				 
//				jsonObj.put("initial", name.substring(0, 1).toUpperCase());
//				System.out.println(jsonObj);
				
				PrintWriter printWriter = response.getWriter();
				printWriter.write(jsonObject);
				printWriter.close();
			} else {
				loginResult = new LoginResult();
				loginResult.setCode(ERROR);
				loginResult.setInfo("infomao");
				loginResult.setUid("");
				String jsonObject = JSONObject.toJSONString(loginResult);

				
				PrintWriter printWriter = response.getWriter();
				printWriter.write(jsonObject);
				printWriter.close();
				
				System.out.println("账号密码不匹配，登录失败");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
