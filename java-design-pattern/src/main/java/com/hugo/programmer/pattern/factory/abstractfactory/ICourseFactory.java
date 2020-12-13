package com.hugo.programmer.pattern.factory.abstractfactory;

import com.hugo.programmer.pattern.factory.ICourse;

public interface ICourseFactory {
	ICourse createCourse();

	INote createNote();

	IVideo createVideo();
}
