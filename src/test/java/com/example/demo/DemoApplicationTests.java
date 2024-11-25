package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repos.ArticleRepository;
import com.example.demo.entities.Article;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private ArticleRepository contactRepository;
	@Test
	public void testCreateContact() {
		Article prod = new Article("Jaket", "L", 100.0, "image1", "Good");

		contactRepository.save(prod);
	}
	
	
	@Test
	public void testUpdateContact()
	{
		Article p = contactRepository.findById(1L).get();
	p.setDescription("Jaket");
	contactRepository.save(p);
	}
	
	
	@Test
	public void testDeleteArticle()
	{
		contactRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousArticles()
	{
	List<Article> prods = contactRepository.findAll();
	for (Article p : prods)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testFindByDescription()
	{
	List<Article> prods = contactRepository.findByDescription("Coat");
	for (Article p : prods)
	{
	System.out.println(p);
	}
	}

	@Test
	public void testfindByDescriptionContains ()
	{
	List<Article> prods=contactRepository.findByDescriptionContains("C");
	for (Article p : prods)
	{
	System.out.println(p);
	} }
	
	
	@Test
	public void testfindByDescriptionPrix()
	{
	List<Article> prods = contactRepository.findByDescriptionPrix("Coat", 100.0);
	for (Article p : prods)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testfindByOrderByDescriptionAsc()
	{
	List<Article> prods =
			contactRepository.findByOrderByDescriptionAsc();
	for (Article p : prods)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testtrierArticlesDescriptionPrix()
	{
	List<Article> prods = contactRepository.trierArticlesDescriptionPrix();
	for (Article p : prods)
	{
	System.out.println(p);
	}
	}



}
