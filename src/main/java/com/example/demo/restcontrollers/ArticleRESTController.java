package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Article;
import com.example.demo.service.ArticleService;

@RestController
@RequestMapping("/api")
@CrossOrigin



public class ArticleRESTController {
	
	@Autowired
	ArticleService articleService;

	@GetMapping
	public List<Article> getAllArticles() {
	return articleService.getAllArticles();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Article getArticleById(@PathVariable("id") Long id) {
	return articleService.getArticle(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Article createProduit(@RequestBody Article produit) {
	return articleService.saveArticle(produit);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Article updateProduit(@RequestBody Article produit) {
	return articleService.updateArticle(produit);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteArticle(@PathVariable("id") Long id)
	{
		articleService.deleteArticleById(id);
	}
	
	
}
