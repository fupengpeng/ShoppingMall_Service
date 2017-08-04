package com.jiudianlianxian.entity.result;

import com.jiudianlianxian.entity.BaseResult;


/**
 * 
 * Title: LoginResult
 * Description: 登录返回信息实体类
 * Company: 济宁九点连线信息技术有限公司
 * ProjectName: AppService
 * @author fupengpeng
 * @date 2017年8月3日 上午11:19:42
 *
 */
public class LoginResult extends BaseResult{
	
	private String uid;
	
	public LoginResult(){}
	public LoginResult(String uid) {
		super();
		this.uid = uid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	
}
