package com.jiudianlianxian.entity.result;

import com.jiudianlianxian.domain.User;
import com.jiudianlianxian.entity.BaseResult;

/**
 * 
 * Title: GetUserInfoResult
 * Description: ����uid��ѯ�û����ݷ���ʵ��
 * Company: �����ŵ�������Ϣ�������޹�˾
 * ProjectName: ShoppingMall
 * @author fupengpeng
 * @date 2017��8��4�� ����11:09:33
 *
 */
public class GetUserInfoResult extends BaseResult {
	
	private User user;

	public GetUserInfoResult() {
	}
	
	public GetUserInfoResult(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	

}
