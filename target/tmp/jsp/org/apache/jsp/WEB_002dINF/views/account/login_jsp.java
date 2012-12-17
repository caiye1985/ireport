package org.apache.jsp.WEB_002dINF.views.account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>登录页</title>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#loginForm\").validate();\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.print(request.getContextPath());
      out.write("\r\n");
      out.write("\t<form id=\"loginForm\" action=\"/ireport/login\" method=\"post\"\r\n");
      out.write("\t\tclass=\"form-horizontal\">\r\n");
      out.write("\t\t");

			String error = (String) request
					.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
			if (error != null) {
		
      out.write("\r\n");
      out.write("\t\t<div class=\"alert alert-error input-medium controls\">\r\n");
      out.write("\t\t\t<button class=\"close\" data-dismiss=\"alert\">×</button>\r\n");
      out.write("\t\t\t登录失败，请重试.\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t<label for=\"username\" class=\"control-label\">名称:</label>\r\n");
      out.write("\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"username\" name=\"username\"\r\n");
      out.write("\t\t\t\t\tclass=\"input-medium required\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t<label for=\"password\" class=\"control-label\">密码:</label>\r\n");
      out.write("\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t<input type=\"password\" id=\"password\" name=\"password\"\r\n");
      out.write("\t\t\t\t\tclass=\"input-medium required\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t<label class=\"checkbox\" for=\"rememberMe\"><input\r\n");
      out.write("\t\t\t\t\ttype=\"checkbox\" id=\"rememberMe\" name=\"rememberMe\" /> 记住我</label> <input\r\n");
      out.write("\t\t\t\t\tid=\"submit_btn\" class=\"btn btn-primary\" type=\"submit\" value=\"登录\" />\r\n");
      out.write("\t\t\t\t<a class=\"btn\" href=\"/ireport/register\">注册</a> <span\r\n");
      out.write("\t\t\t\t\tclass=\"help-block\">(管理员: <b>admin/admin</b>, 普通用户: <b>user/user</b>)\r\n");
      out.write("\t\t\t\t</span> <a class=\"btn\" href=\"/ireport/report\">报表</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
