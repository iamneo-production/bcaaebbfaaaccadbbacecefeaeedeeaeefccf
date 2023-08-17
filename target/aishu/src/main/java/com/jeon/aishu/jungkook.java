package com.jeon.aishu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class jungkook {
	@RequestMapping("/name")
	@ResponseBody
	public String display()
	{
		return "bangtan";
	}

}
