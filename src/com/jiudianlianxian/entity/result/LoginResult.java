package com.jiudianlianxian.entity.result;

import com.jiudianlianxian.entity.BaseResult;


/**
 * 
 * Title: LoginResult
 * Description: ��¼������Ϣʵ����
 * Company: �����ŵ�������Ϣ�������޹�˾
 * ProjectName: AppService
 * @author fupengpeng
 * @date 2017��8��3�� ����11:19:42
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
