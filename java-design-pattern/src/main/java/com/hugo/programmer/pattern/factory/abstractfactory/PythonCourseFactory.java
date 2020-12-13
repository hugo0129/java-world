package com.hugo.programmer.pattern.factory.abstractfactory;

import com.hugo.programmer.pattern.factory.ICourse;
import com.hugo.programmer.pattern.factory.JavaCourse;
import com.hugo.programmer.pattern.factory.PythonCourse;

/**
 * @author Hugo
 */
public class PythonCourseFactory implements ICourseFactory {
	@Override
	public ICourse createCourse() {
		return new PythonCourse();
	}

	@Override
	public INote createNote() {
		return new PythonNote();
	}

	@Override
	public IVideo createVideo() {
		return new PythonVideo();
	}
}
