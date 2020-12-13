package com.hugo.programmer.pattern.factory.simplefactory;

import com.hugo.programmer.pattern.factory.ICourse;
import com.hugo.programmer.pattern.factory.JavaCourse;
import com.hugo.programmer.pattern.factory.PythonCourse;

/**
 * @author Hugo
 */
public class SimpleFactoryTest {
	public static void main(String[] args) {
		// 传统模式
		ICourse course = new JavaCourse();
		course.record();
		// 简单工厂模式
		CourseFactory courseFactory = new CourseFactory();
		ICourse javaCourse = courseFactory.create("Java");
		javaCourse.record();
		// 利用反射机制
		CourseFactory courseCreate = new CourseFactory();
		ICourse iCourse = courseCreate.courseCreate("com.hugo.programmer.pattern.factory.JavaCourse");
		iCourse.record();
		// 利用对象直接创建
		CourseFactory factory = new CourseFactory();
		ICourse courseClass = factory.classCourseCreate(JavaCourse.class);
		courseClass.record();

		// 创建python录制课程
		factory.classCourseCreate(PythonCourse.class).record();

		/**
		 * {@link java.util.Calendar}
		 * getInstance()
		 *
		 * LoggerFactory 简单工厂模式
		 */
	}
}
