package com.jiudianlianxian.entity.result;

import com.jiudianlianxian.domain.User;
import com.jiudianlianxian.entity.BaseResult;

/**
 * 
 * Title: GetUserInfoResult
 * Description: 根据uid查询用户数据返回实体
 * Company: 济宁九点连线信息技术有限公司
 * ProjectName: ShoppingMall
 * @author fupengpeng
 * @date 2017年8月4日 上午11:09:33
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
