/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.aliyunecs;

import com.aliyuncs.RpcAcsRequest;
import com.github.wukong.core.anas.ReqAndRespPatternAnalyzer;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class AliyunEcsKindAnalyzer extends ReqAndRespPatternAnalyzer {

	@Override
	public String getClient() {
		return AliyunDefaultAcsClient.class.getName();
	}

	@Override
	protected String getPostfix() {
		return "Request";
	}

	@Override
	protected String getSuperclass() {
		return RpcAcsRequest.class.getName();
	}

}