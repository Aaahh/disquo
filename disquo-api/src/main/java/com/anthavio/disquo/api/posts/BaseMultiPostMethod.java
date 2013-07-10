package com.anthavio.disquo.api.posts;

import java.util.List;

import com.anthavio.disquo.api.Disqus;
import com.anthavio.disquo.api.DisqusCursorMethod;
import com.anthavio.disquo.api.DisqusMethod;
import com.anthavio.disquo.api.DisqusMethodConfig;

/**
 * Multiple posts on input, multiple on output
 * 
 * @author martin.vanek
 *
 */
public abstract class BaseMultiPostMethod<B extends DisqusMethod<?, List<T>>, T> extends DisqusCursorMethod<B, T> {

	public BaseMultiPostMethod(Disqus disqus, DisqusMethodConfig config) {
		super(disqus, config);
	}

	public B addPost(long... post) {
		addParam("post", post);
		return getB();
	}
}
