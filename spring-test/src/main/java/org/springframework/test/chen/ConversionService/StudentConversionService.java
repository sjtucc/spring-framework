package org.springframework.test.chen.ConversionService;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

/**
 * @Description:
 * @author chenchen
 * @date 2019/10/28 12:49
 */
public class StudentConversionService implements Converter<String, StudentService> {

	@Override
	public StudentService convert(String source) {
		if(StringUtils.hasLength(source)){
			String[] sources = source.split("#");
			StudentService studentService = new StudentService();
			studentService.setAge(sources[1]);
			studentService.setName(sources[0]);
			return studentService;
		}
		return null;
	}


}
