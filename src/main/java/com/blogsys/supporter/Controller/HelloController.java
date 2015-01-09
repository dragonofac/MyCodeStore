package com.blogsys.supporter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}
	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome"); //返回的文件名

		mav.addObject("message","Nope kitty");
		//List
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("c++");
		list.add("oracle");
		mav.addObject("bookList", list);

		//Map
		Map<String,String> map = new HashMap<String,String>();
		map.put("zhangsan", "北京");
		map.put("lisi", "上海");
		map.put("wangwu", "深圳");
		mav.addObject("map",map);
		return mav;
	}
}