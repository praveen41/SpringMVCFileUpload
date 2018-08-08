/**
 * 
 */
package com.techielogic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Praveen
 *
 */

@Controller
public class HelloController {

	@RequestMapping("/")
	public ModelAndView printMessange() {

		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", "Hello World !!!!");
		return mv;
	}
}
