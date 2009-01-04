package cn.org.seventh.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import cn.org.seventh.web.annotation.Path;
import cn.org.seventh.web.annotation.View;
import cn.org.seventh.web.annotation.ViewType;
import cn.org.seventh.web.common.CustomSingleActionController;

/**
 * @spring.web name="/test2/**"
 * @author Andy
 * 
 */
public class Test2 extends CustomSingleActionController {

	@Override
	public long getLastModified(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Path(url = "/test1")
	@View(type = ViewType.FREEMARKER)
	public ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("test2");
		return new ModelAndView("test1.ftl");
	}

}
