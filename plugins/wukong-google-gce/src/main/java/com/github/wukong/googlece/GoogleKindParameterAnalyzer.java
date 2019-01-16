/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.googlece;

import java.math.BigInteger;

import com.github.wukong.core.KindAnalyzer;
import com.github.wukong.core.KindParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2019.1
 */
public class GoogleKindParameterAnalyzer extends KindParameterAnalyzer {

	static {
		blacklist.add(BigInteger.class.getName());
	}
	
	public GoogleKindParameterAnalyzer(KindAnalyzer analyzer) {
		super(analyzer);
	}
}
