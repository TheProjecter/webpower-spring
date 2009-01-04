package cn.org.seventh.web.view;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

import org.springframework.web.servlet.view.xslt.AbstractXsltView;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;


/**
 * @author <a href="mailto:ji.li@symbio-group.com">Andy</a>
 * @since 2008-6-21 上午12:06:14
 */
public class TestXsltView extends AbstractXsltView {
    protected Source createXsltSource(Map model, String rootName, HttpServletRequest
                                      request, HttpServletResponse response) throws Exception {

                                      Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
                                      Element root = document.createElement(rootName);

                                      List words = (List) model.get("wordList");
                                      for (Iterator it = words.iterator(); it.hasNext();) {
                                          String nextWord = (String) it.next();
                                          Element wordNode = document.createElement("word");
                                          Text textNode = document.createTextNode(nextWord);
                                          wordNode.appendChild(textNode);
                                          root.appendChild(wordNode);
                                      }
                                      return new DOMSource(root);
                                  }

}
