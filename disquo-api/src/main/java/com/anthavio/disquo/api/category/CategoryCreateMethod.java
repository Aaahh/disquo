package com.anthavio.disquo.api.category;

import com.anthavio.disquo.api.Disqus;
import com.anthavio.disquo.api.DisqusMethod;
import com.anthavio.disquo.api.DisqusMethodConfig;
import com.anthavio.disquo.api.response.DisqusCategory;

/**
 * http://disqus.com/api/docs/categories/create/
 * 
 * @author mvanek
 * 
 */
public class CategoryCreateMethod extends DisqusMethod<CategoryCreateMethod, DisqusCategory> {

	public CategoryCreateMethod(Disqus feature) {
		super(feature, DisqusMethodConfig.Category.create);
	}

	public CategoryCreateMethod setForum(String forum) {
		addParam("forum", forum);
		return this;
	}

	public CategoryCreateMethod setTitle(String title) {
		addParam("title", title);
		return this;
	}

	public CategoryCreateMethod setDefault(boolean value) {
		addParam("default", value);
		return this;
	}

	@Override
	protected CategoryCreateMethod getB() {
		return this;
	}

}
