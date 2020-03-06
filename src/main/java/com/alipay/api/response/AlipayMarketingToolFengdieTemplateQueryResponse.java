package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FengdieTemplate;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:29:19
 */
public class AlipayMarketingToolFengdieTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2631267411816269112L;

	/** 
	 * 开发者开发上传的H5模板列表
	 */
	@ApiListField("template")
	@ApiField("fengdie_template")
	private List<FengdieTemplate> template;

	public void setTemplate(List<FengdieTemplate> template) {
		this.template = template;
	}
	public List<FengdieTemplate> getTemplate( ) {
		return this.template;
	}

}
