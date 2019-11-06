package org.springframework.test.chen.ConversionService;
/**
 * @Description:
 * @author chenchen
 * @date 2019/10/28 12:53
 */
public class Student {
  private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}
