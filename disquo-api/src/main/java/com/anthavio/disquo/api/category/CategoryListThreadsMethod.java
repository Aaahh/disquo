package com.anthavio.disquo.api.category;

import java.util.Date;

import com.anthavio.disquo.api.Disqus;
import com.anthavio.disquo.api.DisqusCursorMethod;
import com.anthavio.disquo.api.DisqusMethodConfig;
import com.anthavio.disquo.api.ArgumentConfig.Related;
import com.anthavio.disquo.api.response.DisqusThread;

/**
 * 
 * @author martin.vanek
 * 
 * XXX extends DisqusCursorThreadMethod
 */
public class CategoryListThreadsMethod extends DisqusCursorMethod<DisqusThread> {

	public CategoryListThreadsMethod(Disqus disqus) {
		super(disqus, DisqusMethodConfig.Category.listThreads);
	}

	public CategoryListThreadsMethod setCategory(long category) {
		addParam("category", category);
		return this;
	}

	public CategoryListThreadsMethod setSince(Date since) {
		addParam("since", since);
		return this;
	}

	public CategoryListThreadsMethod addRelated(Related... related) {
		addParam("related", related);
		return this;
	}

}
