package com.jiudianlianxian.personcenter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import GetUserInfoResult.GetUserInfoBySexResult;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.jiudianlianxian.domain.User;
import com.jiudianlianxian.entity.result.GetUserInfoResult;
import com.jiudianlianxian.service.UsersService;

/**
 * 
 * Title: GetUserInfoBySex
 * Description: 根据性别查询用户
 * Company: 济宁九点连线信息技术有限公司
 * ProjectName: ShoppingMall
 * @author fupengpeng
 * @date 2017年8月4日 上午11:42:50
 *
 */
public class GetUserInfoBySex extends HttpServlet {
	private static final int SUCCESS = 0;
	private static final int ERROR = 1;

	/**
	 * Constructor of the object.
	 */
	public GetUserInfoBySex() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		// 接收用户提交的uid
		String sex = request.getParameter("sex");
		System.out.println("sex = "+sex);
		
		UsersService usersService = new UsersService();
		GetUserInfoBySexResult getUserInfoBySexResult = new GetUserInfoBySexResult();
		ArrayList<User> users = usersService.getUserBySex(sex);
		try {
			if (users != null) {
				System.out.println("账号密码匹配，登录成功");
				getUserInfoBySexResult.setCode(SUCCESS);
				getUserInfoBySexResult.setInfo("info");
				getUserInfoBySexResult.setUsers(users);

				String jsonArray = JSONArray.toJSONString(users);
				String jsonObject = JSONObject.toJSONString(getUserInfoBySexResult);
				System.out.println("jsonAraay = "+jsonArray);
				System.out.println("jsonObject = "+jsonObject);
				PrintWriter printWriter = response.getWriter();
				printWriter.write(jsonObject);
				printWriter.close();
			} else {
				getUserInfoBySexResult.setCode(ERROR);
				getUserInfoBySexResult.setInfo("infomao");
				String jsonObject = JSONObject.toJSONString(getUserInfoBySexResult);

				
				PrintWriter printWriter = response.getWriter();
				printWriter.write(jsonObject);
				printWriter.close();
				
				System.out.println("账号密码不匹配，登录失败");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		doGet(request, response);
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
