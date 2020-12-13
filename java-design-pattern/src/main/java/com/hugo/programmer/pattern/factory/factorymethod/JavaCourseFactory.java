package com.hugo.programmer.pattern.factory.factorymethod;

import com.hugo.programmer.pattern.factory.ICourse;
import com.hugo.programmer.pattern.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
	@Override
	public ICourse create() {
		return new JavaCourse();
	}
}
