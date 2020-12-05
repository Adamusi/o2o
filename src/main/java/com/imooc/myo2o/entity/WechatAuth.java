package com.imooc.myo2o.entity;

import java.util.Date;

//微信账号实体类
public class WechatAuth {
	private Long wechatAuthId; // ID
	private Long userId; // 用户ID
	private String openId; // OpenID
	private Date createTime; // 创建时间
	private PersonInfo personInfo;

	public Long getWechatAuthId() {
		return wechatAuthId;
	}

	public void setWechatAuthId(Long wechatAuthId) {
		this.wechatAuthId = wechatAuthId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

	@Override
	public String toString() {
		return "WechatAuth [wechatAuthId=" + wechatAuthId + ", userId=" + userId + ", openId=" + openId
				+ ", createTime=" + createTime + ", personInfo=" + personInfo + "]";
	}

}
