package com.example.demo.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomArti", types = {Article.class })

public interface ArticleProjection {
	
	public String getDescription();

}
