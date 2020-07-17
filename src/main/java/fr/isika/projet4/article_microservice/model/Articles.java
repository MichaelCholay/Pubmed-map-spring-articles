package fr.isika.projet4.article_microservice.model;

import java.util.List;

public class Articles {
	
	private List<Article> articles;

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "Articles [articles=" + articles + "]";
	}

	

}
