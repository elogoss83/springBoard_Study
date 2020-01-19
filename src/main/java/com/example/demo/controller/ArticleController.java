package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.ArticleDao;

@Controller
public class ArticleController {

	@Autowired
	ArticleDao dao;

	@RequestMapping("articleList")
	@ResponseBody
	public ArrayList<Article> articlelist() {

		return dao.getArticles();
	}

	@RequestMapping("addArticle")
	@ResponseBody
	public String add(String userId, String title, String body, String nick) {

		return dao.addArticle(userId, title, body, nick);
	}

	@RequestMapping("delArticle")
	@ResponseBody
	public String del(int articleId) {
		return dao.delArticle(articleId);
	}

	@RequestMapping("upArticle")
	@ResponseBody
	public String up(int articleId, String title, String body) {
		return dao.upArticle(articleId, title, body);
	}

}
