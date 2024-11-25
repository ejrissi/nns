package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Article;

@RepositoryRestResource(path = "rest") 
public interface ArticleRepository extends JpaRepository<Article, Long> {

    // Custom query methods
    List<Article> findByDescription(String nom);

    List<Article> findByDescriptionContains(String nom);

    @Query("select a from Article a where a.description like %:nom and a.prix = :prix")
    List<Article> findByDescriptionPrix(@Param("nom") String nom, @Param("prix") Double prix);

    List<Article> findByOrderByDescriptionAsc();

    @Query("select p from Article p order by p.description ASC, p.prix DESC")
    List<Article> trierArticlesDescriptionPrix();
}
