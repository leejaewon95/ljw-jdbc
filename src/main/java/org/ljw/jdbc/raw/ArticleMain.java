package org.ljw.jdbc.raw;

import org.ljw.jdbc.template.ArticleDaolmplUsingTemplate;

public class ArticleMain {

	
	public static void main(String[] args) {
		ArticleDao articleDao = new ArticleDaolmplUsingTemplate();
		Article article = articleDao.getArticle("1");
		System.out.println(article);
	}
}
