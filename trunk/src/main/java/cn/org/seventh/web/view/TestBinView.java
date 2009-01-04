
package cn.org.seventh.web.view;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.org.seventh.web.common.AbstractBinView;

/**
 * @author <a href="mailto:ji.li@symbio-group.com">Andy</a>
 * @since 2008-6-21 上午12:20:23
 */
public class TestBinView extends AbstractBinView {

    /**
     * @see cn.org.seventh.web.common.AbstractBinView#getBufferSize()
     */
    public int getBufferSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * @see cn.org.seventh.web.common.AbstractBinView#getContentLength()
     */
    public int getContentLength() {
        // TODO Auto-generated method stub
        return "hello world!".length();
    }

    /**
     * @see cn.org.seventh.web.common.AbstractBinView#getContentStream(java.util.Map, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    public InputStream getContentStream(Map model, HttpServletRequest request,
                                        HttpServletResponse response) {
        // TODO Auto-generated method stub
        return new ByteArrayInputStream("hello world!".getBytes());
    }

    /**
     * @see cn.org.seventh.web.common.AbstractBinView#getContentType()
     */
    public String getContentType() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @see cn.org.seventh.web.common.AbstractBinView#getFileName()
     */
    public String getFileName() {
        // TODO Auto-generated method stub
        return "hello.txt";
    }
}
