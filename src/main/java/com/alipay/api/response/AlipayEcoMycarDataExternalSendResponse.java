package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.data.external.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-24 10:19:04
 */
public class AlipayEcoMycarDataExternalSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8787587684327325747L;

	/** 
	 * 20
	 */
	@ApiField("external_system_name")
	private String externalSystemName;

	/** 
	 * outter_response
	 */
	@ApiField("process_result")
	private String processResult;

	public void setExternalSystemName(String externalSystemName) {
		this.externalSystemName = externalSystemName;
	}
	public String getExternalSystemName( ) {
		return this.externalSystemName;
	}

	public void setProcessResult(String processResult) {
		this.processResult = processResult;
	}
	public String getProcessResult( ) {
		return this.processResult;
	}

}
