package com.example.demo.service;
import java.util.List;

import com.example.demo.entities.Article;

public interface ArticleService {
	
	Article saveArticle(Article p);
	Article updateArticle(Article p);
	void deleteArticle(Article p);
	 void deleteArticleById(Long id);
	 Article getArticle(Long id);
	List<Article> getAllArticles();
	
	
	List<Article> findByDescription(String nom);
	List<Article> findByDescriptionContains(String nom);
	List<Article> findByDescriptionPrix (String nom, Double prix);
	
	List<Article> findByOrderByDescriptionAsc();
	List<Article> trierArticlesDescriptionPrix();

}
