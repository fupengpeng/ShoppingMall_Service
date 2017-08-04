package GetUserInfoResult;

import java.util.ArrayList;

import com.jiudianlianxian.domain.User;
import com.jiudianlianxian.entity.BaseResult;


/**
 * 
 * Title: GetUserInfoBySexResult
 * Description: 根据性别查询用户
 * Company: 济宁九点连线信息技术有限公司
 * ProjectName: ShoppingMall
 * @author fupengpeng
 * @date 2017年8月4日 上午11:46:52
 *
 */
public class GetUserInfoBySexResult extends BaseResult {

	private ArrayList<User> users;
	public GetUserInfoBySexResult() {
		super();
	}

	public GetUserInfoBySexResult(ArrayList<User> users) {
		super();
		this.users = users;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	
	
	
}
