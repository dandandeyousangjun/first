package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-cn\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>LogIn</title>\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"http://labfile.oss.aliyuncs.com/libs/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"http://labfile.oss.aliyuncs.com/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("  <style>\r\n");
      out.write("        .raise:hover,\r\n");
      out.write(".raise:focus {\r\n");
      out.write("  box-shadow: 0 0.5em 0.5em -0.4em var(--hover);\r\n");
      out.write("  -webkit-transform: translateY(-0.25em);\r\n");
      out.write("          transform: translateY(-0.25em);\r\n");
      out.write("}\r\n");
      out.write("        .raise {\r\n");
      out.write("  --color: #a972cb;\r\n");
      out.write("  --hover: #e5ff60;\r\n");
      out.write("}\r\n");
      out.write("        button {\r\n");
      out.write("         color:var(--color);\r\n");
      out.write("         -webkit-transition: 0.25s;\r\n");
      out.write("         transition: 0.25s;\r\n");
      out.write("         }\r\n");
      out.write("         \r\n");
      out.write("        button:hover, button:focus {\r\n");
      out.write("       border-color: var(--hover);\r\n");
      out.write("       color: #fff;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("       button {\r\n");
      out.write("         background: none;\r\n");
      out.write("          border: 2px solid;\r\n");
      out.write("          font: inherit;\r\n");
      out.write("          line-height: 1;\r\n");
      out.write("          width:80px;\r\n");
      out.write("           margin: 0.5em;\r\n");
      out.write("         padding: 1em 2em;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        body {\r\n");
      out.write("  color:#a972cb;\r\n");
      out.write("  background: #17181c;\r\n");
      out.write("  font: 300 1em 'Fira Sans', sans-serif;\r\n");
      out.write("  -webkit-box-pack: center;\r\n");
      out.write("      -ms-flex-pack: center;\r\n");
      out.write("          justify-content: center;\r\n");
      out.write("  -ms-flex-line-pack: center;\r\n");
      out.write("      align-content: center;\r\n");
      out.write("  -webkit-box-align: center;\r\n");
      out.write("      -ms-flex-align: center;\r\n");
      out.write("          align-items: center;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  min-height: 100vh;\r\n");
      out.write("  display: -webkit-box;\r\n");
      out.write("  display: -ms-flexbox;\r\n");
      out.write("  display: flex;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        body{\r\n");
      out.write("\t\tbackground-image: url('pic/img014.jpg');\r\n");
      out.write("\t\tbackground-repeat: repeat-x;\r\n");
      out.write("\t}\r\n");
      out.write("  </style>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div id=\"alert1\"  class=\"alert alert-success fade in text-center col-xs-2 col-xs-offset-5 hide\">\r\n");
      out.write("                <strong>登陆成功！</strong>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <form id=\"form\" class=\"form-horizontal\" role=\"form\" style=\"margin-top: 73px;\">\r\n");
      out.write("          <div class=\"form-group\"  >\r\n");
      out.write("            <label for=\"username\" class=\"col-xs-2 control-label col-sm-offset-3\" >用户名</label>\r\n");
      out.write("            <div class=\"col-xs-2\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"username\" rel=\"tooltip\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"password\" class=\"col-xs-2 control-label col-sm-offset-3\">密码</label>\r\n");
      out.write("            <div class=\"col-xs-2\">\r\n");
      out.write("              <input type=\"password\" class=\"form-control\" id=\"password\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <div class=\"col-sm-offset-5 col-xs-1\">\r\n");
      out.write("              <button type=\"button\" class=\"raise\" id=\"login\">登录</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-1\">\r\n");
      out.write("              <button type=\"button\" class=\"raise\" data-toggle=\"modal\" data-target=\"#myModal\">注册</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 注册对话框 begin -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("      <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("          <div class=\"modal-header\">\r\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>\r\n");
      out.write("            <h4 class=\"modal-title\" id=\"myModalLabel\">注册界面</h4>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-body\">\r\n");
      out.write("              <form class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("              <div class=\"form-group\"  >\r\n");
      out.write("                <label for=\"reg_username\" class=\"col-xs-2 control-label\" >用户名</label>\r\n");
      out.write("                <div class=\"col-xs-4\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" id=\"reg_username\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"reg_password\" class=\"col-xs-2 control-label\">密码</label>\r\n");
      out.write("                <div class=\"col-xs-4\">\r\n");
      out.write("                  <input type=\"password\" class=\"form-control\" id=\"reg_password\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"reg_repassword\" class=\"col-xs-2 control-label\">再输一遍</label>\r\n");
      out.write("                <div class=\"col-xs-4\">\r\n");
      out.write("                  <input type=\"password\" class=\"form-control\" id=\"reg_repassword\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-footer\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary\" id=\"register\">注册</button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 注册对话框 end -->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"http://labfile.oss.aliyuncs.com/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("            //点击登录\r\n");
      out.write("            $('#login').click(function() {\r\n");
      out.write("                //提交登录表单\r\n");
      out.write("                $.post('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' + '/UserAction?type=1',\r\n");
      out.write("                {\r\n");
      out.write("                    username: $('#username').val(),\r\n");
      out.write("                    password: $('#password').val()\r\n");
      out.write("                },\r\n");
      out.write("                function(data, status) {\r\n");
      out.write("                    if (data == '1') {\r\n");
      out.write("                        createPopOver('#username', 'right', '用户名不能为空 ', 'show');\r\n");
      out.write("                    } else if (data == '2') {\r\n");
      out.write("                        createPopOver('#password', 'right', '密码不能为空', 'show');\r\n");
      out.write("                    } else if (data == '3') {\r\n");
      out.write("                        createPopOver('#username', 'right', ' 用户名不存在', 'show');\r\n");
      out.write("                    } else if (data == '4') {\r\n");
      out.write("                        createPopOver('#password', 'right', '密码错误', 'show');\r\n");
      out.write("                    } else if (data == 5) {\r\n");
      out.write("                        location.href = \"SongJSon.html\";\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            //点击注册按钮\r\n");
      out.write("            $('#register').click(function() {\r\n");
      out.write("                //提交注册表单\r\n");
      out.write("                $.post('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' + '/UserAction?type=2',\r\n");
      out.write("                {\r\n");
      out.write("                    username: $('#reg_username').val(),\r\n");
      out.write("                    password: $('#reg_password').val(),\r\n");
      out.write("                    repassword: $('#reg_repassword').val()\r\n");
      out.write("                },\r\n");
      out.write("                function(data, status) {\r\n");
      out.write("                    if (data == '1') {\r\n");
      out.write("                        createPopOver('#reg_username', 'right', '不能为空', 'show');\r\n");
      out.write("                    } else if (data == '2') {\r\n");
      out.write("                        createPopOver('#reg_password', 'right', '不能为空', 'show');\r\n");
      out.write("                    } else if (data == '3') {\r\n");
      out.write("                        createPopOver('#reg_repassword', 'right', '不能为空', 'show');\r\n");
      out.write("                    } else if (data == '4') {\r\n");
      out.write("                        createPopOver('#reg_repassword', 'right', '密码不匹配', 'show');\r\n");
      out.write("                    } else if (data == '5') {\r\n");
      out.write("                        createPopOver('#reg_username', 'right', '用户名存在', 'show');\r\n");
      out.write("                    } else if (data == '6') {\r\n");
      out.write("                        $('#reg_username').val('');\r\n");
      out.write("                        $('#reg_password').val('');\r\n");
      out.write("                        $('#reg_repassword').val('');\r\n");
      out.write("                        $('#myModal').modal('hide');\r\n");
      out.write("                        $('#alert1').removeClass('hide');\r\n");
      out.write("                        $('#form').css('margin-top', '0px');\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }); \r\n");
      out.write("\r\n");
      out.write("            //显示弹出框\r\n");
      out.write("            function createPopOver(id, placement, content, action) {\r\n");
      out.write("                $(id).popover({\r\n");
      out.write("                    placement: placement,\r\n");
      out.write("                    content: content\r\n");
      out.write("                });\r\n");
      out.write("                $(id).popover(action);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            //点击输入框时销毁弹出框\r\n");
      out.write("            $('#username').click(function() {\r\n");
      out.write("                $('#username').popover('destroy');\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#password').click(function() {\r\n");
      out.write("                $('#password').popover('destroy');\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#reg_username').click(function() {\r\n");
      out.write("                $('#reg_username').popover('destroy');\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#reg_password').click(function() {\r\n");
      out.write("                $('#reg_password').popover('destroy');\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#reg_repassword').click(function() {\r\n");
      out.write("                $('#reg_repassword').popover('destroy');\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
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
