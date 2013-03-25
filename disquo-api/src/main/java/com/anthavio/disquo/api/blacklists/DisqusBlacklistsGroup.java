package com.anthavio.disquo.api.blacklists;

import com.anthavio.disquo.api.Disqus;
import com.anthavio.disquo.api.DisqusFeatureGroup;

/**
 * http://disqus.com/api/docs/blacklists/
 * 
 * @author martin.vanek
 *
 */
public class DisqusBlacklistsGroup extends DisqusFeatureGroup {

	public DisqusBlacklistsGroup(Disqus disqus) {
		super(disqus);
	}

	public BlacklistList list(String forum) {
		return new BlacklistList(disqus).setForum(forum);
	}

	public BlacklistAdd add(String forum) {
		BlacklistAdd method = new BlacklistAdd(disqus);
		method.setForum(forum);
		return method;
	}

	public BlacklistRemove remove(String forum) {
		BlacklistRemove method = new BlacklistRemove(disqus);
		method.setForum(forum);
		return method;
	}
}
