package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.map.geocoding.reverse response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-06 17:56:29
 */
public class AlipayEcoMapGeocodingReverseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1492276463834986643L;

	/** 
	 * 城市名称
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 区名称
	 */
	@ApiField("district")
	private String district;

	/** 
	 * 省份名称
	 */
	@ApiField("province")
	private String province;

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity( ) {
		return this.city;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	public String getDistrict( ) {
		return this.district;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince( ) {
		return this.province;
	}

}
