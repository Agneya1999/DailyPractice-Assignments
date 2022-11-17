import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String userId;
	private String password;

	public String execute() throws Exception {
		if (getUserId().equals("userId") && getPassword().equals("password")) {
			return SUCCESS;
		} else {
			return "failure";
		}

	}

	public void validate() {
		if (StringUtils.isEmpty(getUserId())) {
			addFieldError("userId", "userId can't be blank");
		}
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
