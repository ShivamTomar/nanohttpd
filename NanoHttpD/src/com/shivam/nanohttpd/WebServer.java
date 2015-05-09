package com.shivam.nanohttpd;

import java.util.HashMap;
import java.util.Map;

public class WebServer extends NanoHTTPD {

	public WebServer() {
		super(8080);
	}
	
    @Override public Response serve(IHTTPSession session) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head><title>Hello devices</title></head>");
        sb.append("<body>");
        sb.append("<h1>Hello devices</h1>");
 
        try {
            Map<String, String> files = new HashMap<String, String>();
            session.parseBody(files);
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        sb.append("</body>");
        sb.append("</html>");
        return new Response(sb.toString());
    }
 

}
