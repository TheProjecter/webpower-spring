package cn.org.seventh.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import cn.org.seventh.web.annotation.Path;
import cn.org.seventh.web.annotation.View;
import cn.org.seventh.web.annotation.ViewType;
import cn.org.seventh.web.common.CustomSingleActionController;

/**
 * @spring.web name="/test5/**"
 * @author Andy
 */
public class Test5Controller extends CustomSingleActionController {
	@Path(url = "/test1")
	@View(type = ViewType.JSP)
	public ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("asdasdasd");
		return new ModelAndView("a.jsp");
	}

	@Override
	public long getLastModified(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return 0;
	}

}
