package cn.org.seventh.web.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;
import org.springframework.web.servlet.view.document.AbstractJExcelView;


/**
 * @author <a href="mailto:ji.li@symbio-group.com">Andy</a>
 * @since 2008-6-21 上午12:18:25
 */
public class TestjExcelView extends AbstractJExcelView {

    protected void buildExcelDocument(Map model,
                                      WritableWorkbook wb,
                                      HttpServletRequest request,
                                      HttpServletResponse response)
                                  throws Exception {
                                          
                                      WritableSheet sheet = wb.createSheet("Spring",0);

                                      sheet.addCell(new Label(0, 0, "Spring-Excel test"));
                                      
                                      List words  = (List)model.get("wordList");
                                      for (int i = 0; i < words.size(); i++) {
                                          sheet.addCell(new Label(2+i, 0, (String)words.get(i)));
                                      }
                                  }

   

}
