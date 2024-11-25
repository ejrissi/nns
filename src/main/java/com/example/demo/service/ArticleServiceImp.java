package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Article;
import com.example.demo.repos.ArticleRepository;


@Service
public class ArticleServiceImp implements ArticleService{
	
	
	@Autowired
	ArticleRepository articleRepository;

	@Override
	public Article saveArticle(Article p) {
		return articleRepository.save(p);
	}

	@Override
	public Article updateArticle(Article p) {
		return articleRepository.save(p);
	}

	@Override
	public void deleteArticle(Article p) {
		articleRepository.delete(p);

		
	}

	@Override
	public void deleteArticleById(Long id) {
		articleRepository.deleteById(id);

		
	}

	@Override
	public Article getArticle(Long id) {

		return articleRepository.findById(id).get();
	}

	@Override
	public List<Article> getAllArticles() {
		return articleRepository.findAll();
	}

	@Override
	public List<Article> findByDescription(String nom) {
		return articleRepository.findByDescription(nom);
	}

	@Override
	public List<Article> findByDescriptionContains(String nom) {
		return articleRepository.findByDescriptionContains(nom);
	}

	@Override
	public List<Article> findByDescriptionPrix(String nom, Double prix) {
		return articleRepository.findByDescriptionPrix(nom, prix);
	}

	@Override
	public List<Article> findByOrderByDescriptionAsc() {
		return articleRepository.findByOrderByDescriptionAsc();

	}

	@Override
	public List<Article> trierArticlesDescriptionPrix() {
	
		return articleRepository.trierArticlesDescriptionPrix();
	}
	
	


}
