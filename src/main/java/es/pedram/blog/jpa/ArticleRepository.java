package es.pedram.blog.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = ArticleProjection.class)
public interface ArticleRepository extends CrudRepository<Article, Long> {}
