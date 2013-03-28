package com.anthavio.disquo.api.users;

import com.anthavio.disquo.api.Disqus;
import com.anthavio.disquo.api.DisqusMethodConfig;
import com.anthavio.disquo.api.response.DisqusUser;

/**
 * 
 * @author martin.vanek
 *
 */
public class UserDetailsMethod extends BaseSingleUserMethod<UserDetailsMethod, DisqusUser> {

	public UserDetailsMethod(Disqus disqus) {
		super(disqus, DisqusMethodConfig.Users.details);
	}

	@Override
	protected UserDetailsMethod getB() {
		return this;
	}

}
