package user.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.BaseDto;
import user.dto.UserInfo;
import utils.DtoUtils;
import utils.JsonUtils;

/**
 * Servlet implementation class UserAccessController
 */
@WebServlet("/user/login/v1")
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("±»µ÷ÓÃ:"+(new Date()).toLocaleString());
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(1000001);
		userInfo.setUserName("18817352733");
		userInfo.setUserNickname("rambo");
		userInfo.setUserToken(UUID.randomUUID().toString());
		
		BaseDto<UserInfo> dto = DtoUtils.ok(userInfo);
		
        String result = JsonUtils.toJsonString(dto);
		
		PrintWriter writer = response.getWriter();
		
		writer.write(result);
		
		writer.close();
	}

}
