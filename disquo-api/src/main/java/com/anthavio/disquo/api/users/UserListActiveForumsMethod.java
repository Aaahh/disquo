package com.anthavio.disquo.api.users;

import com.anthavio.disquo.api.Disqus;
import com.anthavio.disquo.api.DisqusCursorMethod;
import com.anthavio.disquo.api.DisqusMethodConfig;
import com.anthavio.disquo.api.QUser;
import com.anthavio.disquo.api.response.DisqusForum;

/**
 * 
 * @author martin.vanek
 *
 */
public class UserListActiveForumsMethod extends DisqusCursorMethod<UserListActiveForumsMethod, DisqusForum> {

	public UserListActiveForumsMethod(Disqus disqus) {
		super(disqus, DisqusMethodConfig.Users.listActiveForums);
	}

	public UserListActiveForumsMethod setSinceId(Integer since_id) {
		addParam("since_id", since_id);
		return this;
	}

	public UserListActiveForumsMethod setUser(long userId) {
		return setUser(QUser.build(userId));
	}

	public UserListActiveForumsMethod setUser(String username) {
		return setUser(QUser.build(username));
	}

	public UserListActiveForumsMethod setUser(QUser user) {
		addParam("user", user);
		return this;
	}

	@Override
	protected UserListActiveForumsMethod getB() {
		return this;
	}

}
