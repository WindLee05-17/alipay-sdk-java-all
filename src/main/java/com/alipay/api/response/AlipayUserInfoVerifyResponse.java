package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.info.verify response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-14 10:16:10
 */
public class AlipayUserInfoVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4251682558694588221L;

	/** 
	 * MATCH, 信息匹配
NOT_MATCH, 信息不匹配
UNKNOWN, 未知（未认证的用户在校验姓名是否匹配时返回该结果）
	 */
	@ApiField("match_result")
	private String matchResult;

	public void setMatchResult(String matchResult) {
		this.matchResult = matchResult;
	}
	public String getMatchResult( ) {
		return this.matchResult;
	}

}