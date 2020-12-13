package com.hugo.programmer.pattern.factory.abstractfactory;

import com.hugo.programmer.pattern.factory.ICourse;
import com.hugo.programmer.pattern.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{
	@Override
	public ICourse createCourse() {
		return new JavaCourse();
	}

	@Override
	public INote createNote() {
		return new JavaNote();
	}

	@Override
	public IVideo createVideo() {
		return new JavaVideo();
	}
}
