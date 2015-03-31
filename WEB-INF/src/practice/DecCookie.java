package practice;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class DecCookie {

	private Cookie cookie = null;
	private Map<String,String> cookies = null;
	private HttpServletResponse response = null;
	private HttpServletRequest request = null;
	private Escape escape = new Escape();
	private int max = 60 * 60 * 24;



	private String Enc(String s) {
		return escape.URLEncode(s);
	}

	public DecCookie(HttpServletRequest req,HttpServletResponse res){
		setHttpServlets(req, res);
	}


	public DecCookie setHttpServlets(HttpServletRequest req,HttpServletResponse res) {
		setRequest(req).setResponse(res);
		return this;
	}

	public DecCookie setResponse(HttpServletResponse res) {
		response=res;
		return this;
	}

	public DecCookie setRequest(HttpServletRequest req) {
		request=req;
		return this;
	}

	public DecCookie addCookie() {
		addCookie(max);
		return this;
	}

	public DecCookie addCookie(int sec) {
		cookie.setPath("/");
		cookie.setMaxAge(sec);
		response.addCookie(cookie);
		return this;
	}



}
