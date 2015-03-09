package course.dto;

import java.io.Serializable;

public class Course implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long courseId;
	private String name;
	private int day;
	private long startSchoolYear;
	private long endSchoolYear;
	private String locale;
	private int maxCount;
	private String period;
	private int sectionstart;
	private int sectionend;
	private int semester;
	private String smartPeriod;
	private String teacher;
	private int supportAmount;
	private int nonsupportAmount;
	private int studentCount;
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public long getStartSchoolYear() {
		return startSchoolYear;
	}
	public void setStartSchoolYear(long startSchoolYear) {
		this.startSchoolYear = startSchoolYear;
	}
	public long getEndSchoolYear() {
		return endSchoolYear;
	}
	public void setEndSchoolYear(long endSchoolYear) {
		this.endSchoolYear = endSchoolYear;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public int getSectionstart() {
		return sectionstart;
	}
	public void setSectionstart(int sectionstart) {
		this.sectionstart = sectionstart;
	}
	public int getSectionend() {
		return sectionend;
	}
	public void setSectionend(int sectionend) {
		this.sectionend = sectionend;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getSmartPeriod() {
		return smartPeriod;
	}
	public void setSmartPeriod(String smartPeriod) {
		this.smartPeriod = smartPeriod;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public int getSupportAmount() {
		return supportAmount;
	}
	public void setSupportAmount(int supportAmount) {
		this.supportAmount = supportAmount;
	}
	public int getNonsupportAmount() {
		return nonsupportAmount;
	}
	public void setNonsupportAmount(int nonsupportAmount) {
		this.nonsupportAmount = nonsupportAmount;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", day="
				+ day + ", startSchoolYear=" + startSchoolYear
				+ ", endSchoolYear=" + endSchoolYear + ", locale=" + locale
				+ ", maxCount=" + maxCount + ", period=" + period
				+ ", sectionstart=" + sectionstart + ", sectionend="
				+ sectionend + ", semester=" + semester + ", smartPeriod="
				+ smartPeriod + ", teacher=" + teacher + ", supportAmount="
				+ supportAmount + ", nonsupportAmount=" + nonsupportAmount
				+ ", studentCount=" + studentCount + "]";
	}
	
	
}
