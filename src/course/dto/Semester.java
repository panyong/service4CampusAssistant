package course.dto;

import java.io.Serializable;

public class Semester implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long startSchoolYear;
	private long endSchoolYear;
	private int maxCount;
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
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	
	
}
