package com.github.wukong.aliyunecs;

import com.github.wukong.core.KindParameterAnalyzer;
import com.github.wukong.core.tools.ParametersTool;

public class AliyunEcsKindParameterAnalyzerTest {

	public static void main(String[] args) {
		AliyunEcsKindAnalyzer ka = new AliyunEcsKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParametersTool.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
