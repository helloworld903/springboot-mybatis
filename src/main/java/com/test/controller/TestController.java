package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.mapper.PlayerMapper;
import com.test.model.Player;

@Controller
public class TestController {
	@Autowired
	private PlayerMapper playerMapper;
	
	@ResponseBody
	@RequestMapping(value= {"","/","home"})
	public void test() {
		List<Player>list=playerMapper.selectAllPlayer();
		for(Player p:list) {
			System.out.printf("%s %s\n",p.getName(),p.getPassword());
		}
	}
}
