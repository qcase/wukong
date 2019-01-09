/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.wukong.core.impl;

import java.lang.reflect.Method;

import com.github.wukong.core.KindAnalyzer;
import com.github.wukong.core.KindParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2019.1
 */
public class DefaultModelParameterAnalyzer extends KindParameterAnalyzer {

	public DefaultModelParameterAnalyzer(KindAnalyzer analyzer) {
		super(analyzer);
	}

	@Override
	protected boolean canReflect(Method method) {
		return false;
	}

	@Override
	protected boolean canNested(String typename) {
		return false;
	}

}
