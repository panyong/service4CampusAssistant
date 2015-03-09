package course.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Decoder.BASE64Encoder;
import utils.DtoUtils;
import utils.JsonUtils;
import common.CommonError;
import course.dto.Picture;
import dto.BaseDto;

/**
 * Servlet implementation class CourseServlet
 */
@WebServlet("/timetable/getVerification/v1")
public class CourseServletStep1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseServletStep1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("image/png");
		
		BaseDto<Picture> dto = null;
		
		String stuNum = request.getParameter("stuNum");
		String stuPassword = request.getParameter("stuPassword");
		
		if (stuNum == null || stuNum.isEmpty() || stuPassword == null || stuPassword.isEmpty()) {
			dto = DtoUtils.dto(CommonError.Course_GET_PARAM_LACK);
		}else {
			String imgString = parseImageToString("G:\\AppTempData\\20111750.png");
			
			Picture pic = new Picture();
			
			pic.setPic(imgString);
			
			dto = DtoUtils.ok(pic);
		}
		
		String result = JsonUtils.toJsonString(dto);
		
		PrintWriter writer = response.getWriter();
		
		writer.write(result);
		
		writer.close();
	}

	private String parseImageToString(String filePath) {
		File file = new File(filePath);
		String image = new String();
		
		try {
			FileInputStream in = new FileInputStream(file);
			byte[] tempByte = new byte[in.available()];
			in.read(tempByte);
			in.close();
			
			BASE64Encoder encoder = new BASE64Encoder();
			image = encoder.encode(tempByte);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}

}
