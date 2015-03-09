package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import utils.JsonUtils;
import course.dto.Course;
import course.dto.Semester;

public class CourseFactory {
	private static List<Course> courseList = new ArrayList<Course>();
	private static Semester semester = new Semester();
	
	public static List<Course> getCourseList() {
		return courseList;
	}
	
	public static Semester getSemester() {
		return semester;
	}

	static{
		semester.setEndSchoolYear(2015);
		semester.setStartSchoolYear(2014);
		semester.setMaxCount(12);
		
		String jsonOfCourses = readCoursesFormFile("G:\\AppTempData\\courseList.json");
		courseList = JsonUtils.getNodeToList(jsonOfCourses, "lessonList", Course.class);
	}
	
//	public static void main(String[] args) {
//		List<Course> list = getCourseList();
//		
//		for (Course course : list) {
//			System.out.println(course.toString());
//		}
//	}

	private static String readCoursesFormFile(String filePath) {
		File file = new File(filePath);
		StringBuilder builder = new StringBuilder();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			while((tempString = reader.readLine()) != null) {
				builder.append(tempString);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return builder.toString();
	}
}
