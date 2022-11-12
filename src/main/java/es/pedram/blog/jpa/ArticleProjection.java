package es.pedram.blog.jpa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(
    types = {Article.class},
    name = "verbose"
)
public interface ArticleProjection {
    Long getId();
    String getTitle();
    String getBody();
    @Value("#{target.body.substring(0, 50)} ...")
    String getSummary();
}
