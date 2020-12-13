package com.hugo.programmer.pattern.factory.factorymethod;

import com.hugo.programmer.pattern.factory.ICourse;
import com.hugo.programmer.pattern.factory.JavaCourse;
import com.hugo.programmer.pattern.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
	@Override
	public ICourse create() {
		return new PythonCourse();
	}
}
