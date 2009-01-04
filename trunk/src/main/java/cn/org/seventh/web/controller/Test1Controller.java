package cn.org.seventh.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import cn.org.seventh.web.annotation.Path;
import cn.org.seventh.web.annotation.View;
import cn.org.seventh.web.annotation.ViewType;
import cn.org.seventh.web.common.CustomMultiActionController;

/**
 * @spring.web name="/test/**"
 * @author Andy
 */
public class Test1Controller extends CustomMultiActionController {

	@Path(url = "/test1")
	@View(type = ViewType.JSP)
	public ModelAndView test(HttpServletRequest request,
			HttpServletResponse response) {
		response.setContentType("text/html");
		System.out.println("1test111");
		// InputStream stream =
		// new FileInputStream(
		// "M:/tomcat/webapps/plantpharm/WEB-INF/classes/a.properties");
		// DataInputStream dataInputStream = new DataInputStream(stream);
		// String s = dataInputStream.readLine();
		// // Properties properties = new Properties();
		// // properties.load(stream);
		// String validate = s;// properties.getProperty("test");
		// System.out.println(s);
		// Validator validator = (Validator)
		// Class.forName(validate).newInstance();
		// validator.validate("", "");
		return new ModelAndView("test4.jsp");
	}
}
