package com.hugo.programmer.pattern.factory.factorymethod;

import com.hugo.programmer.pattern.factory.ICourse;
import com.hugo.programmer.pattern.factory.JavaCourse;
import com.hugo.programmer.pattern.factory.PythonCourse;
import com.hugo.programmer.pattern.factory.simplefactory.CourseFactory;

/**
 * @author Hugo
 */
public class FactoryMethodTest {
	public static void main(String[] args) {
		ICourseFactory factory = new PythonCourseFactory();
		ICourse iCourse = factory.create();
		iCourse.record();
	}
}
