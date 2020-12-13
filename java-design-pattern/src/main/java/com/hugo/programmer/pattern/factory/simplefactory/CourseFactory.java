package com.hugo.programmer.pattern.factory.simplefactory;

import com.hugo.programmer.pattern.factory.ICourse;
import com.hugo.programmer.pattern.factory.JavaCourse;

import java.util.Objects;

public class CourseFactory {
	public ICourse create(String name) {
		if ("Java".equals(name)) {
			return new JavaCourse();
		} else {
			return null;
		}
	}

	/**
	 * 利用反射机制，创建对应课程
	 *
	 * @param className
	 * @return
	 */
	public ICourse courseCreate(String className) {
		try {
			if (!(null == className || "".equals(className))) {
				return (ICourse) Class.forName(className).newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public ICourse classCourseCreate(Class clazz) {
		if (Objects.nonNull(clazz)) {
			try {
				return (ICourse) clazz.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
