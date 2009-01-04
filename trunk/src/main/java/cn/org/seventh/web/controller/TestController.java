package cn.org.seventh.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;

import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import cn.org.seventh.web.annotation.Path;
import cn.org.seventh.web.annotation.View;
import cn.org.seventh.web.annotation.ViewType;
import cn.org.seventh.web.common.CustomMultiActionController;
import cn.org.seventh.web.view.TestBinView;
import cn.org.seventh.web.view.TestExcelView;
import cn.org.seventh.web.view.TestPdfView;
import cn.org.seventh.web.view.TestjExcelView;

/**
 * @spring.web name="/test3/**"
 * @author Andy
 */
public class TestController extends CustomMultiActionController {
	@Path(url = "/0")
	@View(type = ViewType.FORWARD)
	public ModelAndView rrrr11(HttpServletRequest request,
			HttpServletResponse response, Object object) {
		System.out.println("test");
		return new ModelAndView("/action/test3/2");
	}

	@Path(url = "/1")
	@View(type = ViewType.REDIRECT)
	public ModelAndView rrrr1(HttpServletRequest request,
			HttpServletResponse response, Object object) {
		System.out.println("test");
		return new ModelAndView("/");
	}

	@Path(url = "/2")
	@View(type = ViewType.JSP)
	public ModelAndView rrrr(HttpServletRequest request,
			HttpServletResponse response, Object object) {
		System.out.println("test2");
		return new ModelAndView("test4.jsp");
	}

	@Path(url = "/3")
	@View(type = ViewType.FREEMARKER)
	public ModelAndView test(HttpServletRequest request,
			HttpServletResponse response, Object object) {
		System.out.println("test");
		return new ModelAndView("test1.ftl");
	}

	@Path(url = "/4")
	@View(type = ViewType.VELOCITY)
	public ModelAndView hello(HttpServletRequest request,
			HttpServletResponse response, Object object) {
		System.out.println("hello");
		return new ModelAndView("test2.vm");
	}

	@Path(url = "/5")
	@View(type = ViewType.XSLT)
	public ModelAndView hi(HttpServletRequest request,
			HttpServletResponse response, Object object) {
		System.out.println("hi");
		Map map = new HashMap();
		List wordList = new ArrayList();
		wordList.add("hello");
		wordList.add("world");
		map.put("wordList", wordList);
		Document document = null;
		try {
			document = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder().newDocument();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Element root = document.createElement("root");

		List words = (List) map.get("wordList");
		for (Iterator it = words.iterator(); it.hasNext();) {
			String nextWord = (String) it.next();
			Element wordNode = document.createElement("word");
			Text textNode = document.createTextNode(nextWord);
			wordNode.appendChild(textNode);
			root.appendChild(wordNode);
		}
		map.put("cool", new DOMSource(root));
		return new ModelAndView("style.xml", map);
	}

	@Path(url = "/6")
	@View(type = ViewType.OTHER)
	public ModelAndView hi1(HttpServletRequest request,
			HttpServletResponse response, Object object) {
		System.out.println("hi");
		Map map = new HashMap();
		List wordList = new ArrayList();
		wordList.add("hello");
		wordList.add("world");
		map.put("wordList", wordList);
		return getModelAndView(new TestExcelView(), map);
	}

	@Path(url = "/7")
	@View(type = ViewType.OTHER)
	public ModelAndView hi2(HttpServletRequest request,
			HttpServletResponse response, Object object) {
		System.out.println("hi");
		Map map = new HashMap();
		List wordList = new ArrayList();
		wordList.add("hello");
		wordList.add("world");
		map.put("wordList", wordList);
		return getModelAndView(TestjExcelView.class, map);
	}

	@Path(url = "/8")
	@View(type = ViewType.OTHER)
	public ModelAndView hi3(HttpServletRequest request,
			HttpServletResponse response, Object object) {
		System.out.println("hi");
		Map map = new HashMap();
		List wordList = new ArrayList();
		wordList.add("hello");
		wordList.add("world");
		map.put("wordList", wordList);
		return getModelAndView(new TestPdfView(), map);
	}

	@Path(url = "/9")
	@View(type = ViewType.OTHER)
	public ModelAndView hi4(HttpServletRequest request,
			HttpServletResponse response, Object object) {
		System.out.println("hi");
		Map map = new HashMap();
		List wordList = new ArrayList();
		wordList.add("hello");
		wordList.add("world");
		map.put("wordList", wordList);
		return getModelAndView(new TestBinView(), map);
	}
}
