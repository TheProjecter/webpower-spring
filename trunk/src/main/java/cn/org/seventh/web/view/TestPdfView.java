package cn.org.seventh.web.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;



import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;


/**
 * @author <a href="mailto:ji.li@symbio-group.com">Andy</a>
 * @since 2008-6-21 上午12:20:23
 */
public class TestPdfView extends AbstractPdfView {

    protected void buildPdfDocument(
        Map model,
        Document doc,
        PdfWriter writer,
        HttpServletRequest req,
        HttpServletResponse resp)
        throws Exception {
        
        List words = (List) model.get("wordList");
        
        for (int i=0; i<words.size(); i++)
            doc.add( new Paragraph((String) words.get(i)));
    
    }

   
}
