package com.hugo.programmer.pattern.factory.factorymethod;

import com.hugo.programmer.pattern.factory.ICourse;

/**
 * @author Hugo
 */
public interface ICourseFactory {
	/**
	 * 课程创建
	 *
	 * @return
	 */
	ICourse create();
}
