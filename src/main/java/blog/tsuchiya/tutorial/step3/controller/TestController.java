package blog.tsuchiya.tutorial.step3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping
	public String index(Model model) {
		model.addAttribute("title", "コンテンツページ");
		return "contents";
	}

	@GetMapping("other")
	public String other(Model model) {
		model.addAttribute("title", "別ページ");
		return "other";
	}

}
