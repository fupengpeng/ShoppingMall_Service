package GetUserInfoResult;

import java.util.ArrayList;

import com.jiudianlianxian.domain.User;
import com.jiudianlianxian.entity.BaseResult;


/**
 * 
 * Title: GetUserInfoBySexResult
 * Description: �����Ա��ѯ�û�
 * Company: �����ŵ�������Ϣ�������޹�˾
 * ProjectName: ShoppingMall
 * @author fupengpeng
 * @date 2017��8��4�� ����11:46:52
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
