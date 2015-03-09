package course.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.CommonError;
import common.CourseFactory;
import utils.DtoUtils;
import utils.JsonUtils;
import course.dto.Course;
import course.dto.Semester;
import course.dto.TimetableDto;
import dto.BaseDto;

/**
 * Servlet implementation class CourseServlet
 */
@WebServlet("/timetable/checkVerification/v1")
public class CourseServletStep2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseServletStep2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		BaseDto<TimetableDto> dto = null;
		
		String verifyCode = request.getParameter("verifyCode");
		
		if (verifyCode == null || verifyCode.isEmpty()) {
			dto = DtoUtils.dto(CommonError.Course_GET_PARAM_LACK);
		}else {
			TimetableDto timetableDto = new TimetableDto();
			List<Course> courseList = CourseFactory.getCourseList();
			Semester semester = CourseFactory.getSemester();
			
			timetableDto.setCourseList(courseList);
			timetableDto.setSemester(semester);
			
			dto = DtoUtils.ok(timetableDto);
		}
		
		String result = JsonUtils.toJsonString(dto);
		
		PrintWriter writer = response.getWriter();
		
		writer.write(result);
		
		writer.close();
	}

}
