package com.nature.disqus.browser;

import com.anthavio.disquo.api.auth.SsoAuthData;
import com.anthavio.disquo.api.response.DisqusUser;
import com.anthavio.disquo.api.response.JsonStringBuilder;
import com.anthavio.disquo.api.response.TokenResponse;

/**
 * 
 * @author martin.vanek
 *
 */
public class UserIdentity {

	public static enum Type {
		sso, oauth, application;
	}

	private Type type;

	private SsoAuthData sso;

	private TokenResponse oauth;

	private String applicationToken;

	private DisqusUser disqusUser;

	@Override
	public String toString() {
		return JsonStringBuilder.toString(this);
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public SsoAuthData getSso() {
		return sso;
	}

	public void setSso(SsoAuthData sso) {
		this.sso = sso;
	}

	public TokenResponse getOauth() {
		return oauth;
	}

	public void setOauth(TokenResponse oauth) {
		this.oauth = oauth;
	}

	public String getApplicationToken() {
		return applicationToken;
	}

	public void setApplicationToken(String appToken) {
		this.applicationToken = appToken;
	}

	public void setDisqusUser(DisqusUser disqusUser) {
		this.disqusUser = disqusUser;
	}

	public DisqusUser getDisqusUser() {
		return disqusUser;
	}

}
