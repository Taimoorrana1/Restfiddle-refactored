/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.26
 * Generated at: 2015-12-01 16:19:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\t<script>\n");
      out.write("\tvar ctx = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("    </script>\n");
      out.write("\t<!-- Templates -->\n");
      out.write("\t<script type=\"text/template\" id=\"tpl-workspace-list-item\">\n");
      out.write("\t\t<div id=\"dd-workspace\">\n");
      out.write("          <div class=\"dummyWorkspaceName\"><@=workspace.name@>&nbsp;&nbsp;\n");
      out.write("              <div class=\"btn-group hover-down-arrow\">\n");
      out.write("                <button type=\"button\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                    <span class= \"fa fa-angle-down\"></span> <span class=\"sr-only\">Toggle Dropdown</span>\n");
      out.write("                </button>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                    <li class=\"edit-workspace\"><i class=\"fa fa-pencil fa-fw\"></i> Edit Workspace</li>\n");
      out.write("                    <li class=\"delete-workspace\"><i class=\"fa fa-trash-o fa-fw\"></i> Delete Workspace</li>\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li class=\"export-workspace\"><i class=\"fa fa-download fa-fw\"></i> Export Workspace</li>\n");
      out.write("                    <li class=\"export-workspace\"><i class=\"fa fa-download fa-fw\"></i> Export (Swagger)</li>\n");
      out.write("                </ul>\n");
      out.write("            </div></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</script>\n");
      out.write("\t<script type=\"text/template\" id=\"tpl-project-list-item\">\n");
      out.write("\t\t<a href=\"#/workspace/<@=project.workspaceId@>/project/<@=project.id@>\" id = <@=project.id@>   data-project-ref-id = <@=project.projectRef.id@> class =\"project-name\">\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-list-alt\">\n");
      out.write("\t\t</span>&nbsp;&nbsp;<@=project.name@>&nbsp;&nbsp;\n");
      out.write("              <div class=\"btn-group hover-down-arrow\">\n");
      out.write("                <button type=\"button\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                    <span class= \"fa fa-angle-down\"></span> <span class=\"sr-only\">Toggle Dropdown</span>\n");
      out.write("                </button>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                    <li class=\"edit-project\"><i class=\"fa fa-pencil fa-fw\"></i> Edit Project</li>\n");
      out.write("                    <li class=\"delete-project\"><i class=\"fa fa-trash-o fa-fw\"></i> Delete Project</li>\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li class=\"export-project\"><i class=\"fa fa-download fa-fw\"></i> Export Project</li>\n");
      out.write("                    <li class=\"export-project\"><i class=\"fa fa-download fa-fw\"></i> Export (Swagger)</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </a>\n");
      out.write("\t</script>\n");
      out.write("\t<script type=\"text/template\" id=\"tpl-workspace-all-list-item\">\n");
      out.write("\t\t<a href=\"#/workspace/<@=workspace.id@>\" data-workspace-id = <@=workspace.id@> class=\"dummyWSli list-group-item\"><@=workspace.name@></a>\n");
      out.write("\t</script>\n");
      out.write("\t<script type=\"text/template\" id=\"tpl-user-list-item\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-xs-6\">\n");
      out.write("\t\t\t\t<h5 class=\"dummyUserName\"><@=user.name@></h5>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-6\">\n");
      out.write("\t\t\t<@ var name = $(\".username\").text(); if ( $.trim(name) != user.name ) { @>\n");
      out.write("\t\t\t\t<a href=\"#\" data-user-id=<@=user.id@> class=\"deleteUser\">Delete</a>\n");
      out.write("\t\t\t<@ } else{ @>\n");
      out.write("\t\t\t\t<span>Logged in</span>\n");
      out.write("\t\t\t<@ }  @>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</script>\n");
      out.write("\t<script type=\"text/template\" id=\"tpl-tag-list-item\">\n");
      out.write("        <a href=\"#/workspace/<@=tag.workspaceId@>/tag/<@=tag.id@>\" id=<@=tag.id@> class = \"tag-name\"><span class=\"glyphicon glyphicon-tag\"></span>&nbsp;&nbsp;<@=tag.name@>&nbsp;&nbsp;\n");
      out.write("         <div class=\"btn-group hover-down-arrow\">\n");
      out.write("                <button type=\"button\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                    <span class= \"fa fa-angle-down\"></span> <span class=\"sr-only\">Toggle Dropdown</span>\n");
      out.write("                </button>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                    <li class=\"edit-tag\"><i class=\"fa fa-pencil fa-fw\"></i> Edit Tag</li>\n");
      out.write("                    <li class=\"delete-tag\"><i class=\"fa fa-trash-o fa-fw\"></i> Delete Tag</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\t</script>\n");
      out.write("    <script type=\"text/template\" id=\"tpl-tags-list-item\">\n");
      out.write("        <input type = \"checkbox\" id = <@=tag.name@>>&nbsp;<@=tag.name@>&nbsp;&nbsp;\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("     <script type=\"text/template\" id=\"assert-result-list-item\">\n");
      out.write("         <tr><td><span class=\"<@=result.iconClass@> circle\"></span><@=result.status@></td><td><@=result.propertyName@></td><td><@=result.comparator@></td><td><@=result.expectedValue@></td><td><@=result.actualValue@></td><tr>                   \n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("\t<script type=\"text/template\" id=\"tpl-star-list-item\">\n");
      out.write("\t\t<a href=\"#\" class=\"list-group-item\" data-star-id=<@=node.id@> data-star-ref-id=<@=node.id@> data-toggle=\"tooltip\" data-placement=\"bottom\" title=<@=node.apiURL@>>\n");
      out.write("\t\t\t<span class=\"<@=node.className@>\"><@=node.methodType@></span>&nbsp;&nbsp;<@=node.name@>\n");
      out.write("             <div><span>&nbsp;&nbsp;<@=node.time@></span><span>&nbsp;<@=node.runBy@><span></div>\n");
      out.write("\t\t</a>\n");
      out.write("\t</script>\n");
      out.write("    <script type=\"text/template\" id=\"tpl-tagged-node-list-item\">\n");
      out.write("\t\t<a href=\"#\" class=\"list-group-item\" data-node-id=<@=node.id@> data-tag-node-id=<@=node.id@> data-toggle=\"tooltip\" data-placement=\"bottom\" title=<@=node.apiURL@>>\n");
      out.write("\t\t\t<span class=\"<@=node.className@>\"><@=node.methodType@></span>&nbsp;&nbsp;<@=node.name@>\n");
      out.write("             <div><span>&nbsp;&nbsp;<@=node.time@></span><span>&nbsp;<@=node.runBy@><span></div>\n");
      out.write("\t\t</a>\n");
      out.write("\t</script>\n");
      out.write("\t<script type=\"text/template\" id=\"tpl-project-runner-list-item\">\n");
      out.write("        <div class=\"div-list-item\">\n");
      out.write("            <p><span class=\"label label-primary\"><@=nodeStatusResponse.methodType@></span>&nbsp;&nbsp;<strong><@=nodeStatusResponse.name@></strong></p>\n");
      out.write("            <p><@=nodeStatusResponse.description@></p>\n");
      out.write("            <p><@=nodeStatusResponse.apiUrl@>&nbsp;&nbsp;<@=nodeStatusResponse.duration@>&nbsp;ms</p>\n");
      out.write("        </div>\n");
      out.write("\t</script>\n");
      out.write("\t<script type=\"text/template\" id=\"tpl-history-list-item\">\n");
      out.write("\t\t<a href=\"#\" class=\"list-group-item\" data-history-id=<@=conversation.id@> data-history-ref-id=<@=conversation.id@> data-toggle=\"tooltip\" data-placement=\"bottom\" title=<@=conversation.rfRequestDTO.apiUrl@> >\n");
      out.write("\t\t\t<div class=\"<@=conversation.className@>\"><@=conversation.rfRequestDTO.methodType@></div>\n");
      out.write("\t\t\t<@ if (conversation.name == null || conversation.name == \"\" ) { @>\n");
      out.write("   \t\t\t \t<div class=\"activity\"><@=conversation.rfRequestDTO.apiUrl@></div>\n");
      out.write("\t\t\t<@ }  else { @>\n");
      out.write("\t\t\t\t<div class = \"activity\"><@=conversation.name@></div>\n");
      out.write("\t\t\t<@ } @>\n");
      out.write("            \n");
      out.write("             <span><@=conversation.time@></span><span>&nbsp;<@=conversation.runBy@></span>\n");
      out.write("        </a>\n");
      out.write("\t</script>\n");
      out.write("    <script type=\"text/template\" id=\"tpl-entity-field\">\n");
      out.write("    <p>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control entityFieldName\" placeholder=\"Enter Field Name\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-5\">\n");
      out.write("                <select class=\"form-control entityFieldType\">\n");
      out.write("                    <option>String</option>\n");
      out.write("                    <option>Number</option>\n");
      out.write("                    <option>Boolean</option>\n");
      out.write("                    <option>Date</option>\n");
      out.write("                    <option>Object</option>\n");
      out.write("                    <option>Array</option>\n");
      out.write("\t\t\t\t\t<option>Relation</option>\n");
      out.write("                    <option>Geographic point</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-2\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default destroy\"><span class=\"glyphicon glyphicon-remove\"></span>                   </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </p>    \n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/template\" id=\"tpl-query-param-item\">\n");
      out.write("    <p>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control urlDataName\" placeholder=\"Enter Key\" value = <@=query.paramKey@>>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control urlDataValue\" placeholder=\"Enter Value\" value = <@=query.paramValue@>>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-2\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default destroy\"><span class=\"glyphicon glyphicon-remove\"></span>                   </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </p>    \n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/template\" id=\"tpl-query-param-list-item\">\n");
      out.write("    <p>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control urlDataName\" placeholder=\"Enter Key\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control urlDataValue\" placeholder=\"Enter Value\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-2\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default destroy\"><span class=\"glyphicon glyphicon-remove\"></span>                   </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </p>    \n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/template\" id=\"tpl-form-list-item\">\n");
      out.write("    <p>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control formDataName\" placeholder=\"Enter Key\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control formDataValue\" placeholder=\"Enter Value\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-2\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default destroy\"><span class=\"glyphicon glyphicon-remove\"></span>                   </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </p>    \n");
      out.write("    </script> \n");
      out.write("    <script type=\"text/template\" id=\"tpl-file-list-item\">\n");
      out.write("    <p>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control fileDataName\" placeholder=\"Enter Key\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-5\">\n");
      out.write("                <input type=\"file\" class=\"form-control fileDataValue\" placeholder=\"Enter Value\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-2\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default destroy\"><span class=\"glyphicon glyphicon-remove\"></span>                   </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </p>    \n");
      out.write("    </script> \n");
      out.write("    <script type=\"text/template\" id=\"tpl-header-list-item\">\n");
      out.write("    <p>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control headerName http-header\" placeholder=\"Enter Header Name\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control headerValue\" placeholder=\"Enter Header Value\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-2\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default destroy\"><span class=\"glyphicon glyphicon-remove\"></span>                   </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </p>    \n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/template\" id=\"tpl-environment\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-xs-12\">\n");
      out.write("            <input type=\"text\" id=\"environmentName\" data-environment-id=\"-1\" class=\"form-control\" placeholder=\"Enter Environment Name\" name=\"envName\" required> <br>\n");
      out.write("            <button type=\"button\" class=\"btn btn-default btn-sm\" id=\"addEnvFieldBtn\">New Property</button>  <button type=\"button\" class=\"btn btn-default btn-sm pull-right\" id=\"deleteEnvironment\">Delete Environment</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-xs-12\">\n");
      out.write("            <div id=\"envFieldsWrapper\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/template\" id=\"tpl-env-field\">\n");
      out.write("    <p>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control envPropertyName http-header\" placeholder=\"Enter Property Name\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control envPropertyValue\" placeholder=\"Enter Property Value\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-2\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default destroy\"><span class=\"glyphicon glyphicon-remove\"></span>                   </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </p>    \n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/template\" id=\"tpl-manage-environment\">\n");
      out.write("    <div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-6\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" id=\"addNewEnvironmentBtn\">New Environment</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-6\">\n");
      out.write("                <select class=\"existingEnvironments form-control\">\n");
      out.write("                    <option>Update Existing</option>\n");
      out.write("                    <option>Dev Env</option>\n");
      out.write("                    <option>QA Env</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    <div id=\"environmentWrapper\">\n");
      out.write("    </div>\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/template\" id=\"tpl-assert\">\n");
      out.write("    <p>\n");
      out.write("        <div class=\"row assertRow\">\n");
      out.write("            <div class=\"col-xs-4\">\n");
      out.write("                <input type=\"text\" class=\"form-control assertPropertyName http-header\" placeholder=\"Property Name or Expression\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-2\">\n");
      out.write("                <select class=\"assertCompare form-control\" placeholder=\"Select\">\n");
      out.write("                  <option>=</option>\n");
      out.write("                  <option>!=</option>\n");
      out.write("                  <option>Contains</option>\n");
      out.write("                  <option>! Contains</option>\n");
      out.write("                  <option><</option>\n");
      out.write("                  <option><=</option>\n");
      out.write("                  <option>></option>\n");
      out.write("                  <option>>=</option>\n");
      out.write("                  <option>Contains Key</option>\n");
      out.write("                  <option>! Contains Key</option>\n");
      out.write("                  <option>Contains Value</option>\n");
      out.write("                  <option>! Contains Value</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-4\">\n");
      out.write("                <input type=\"text\" class=\"form-control assertExpectedValue\" placeholder=\"Expected Value\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-2\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default destroy\"><span class=\"glyphicon glyphicon-remove\"></span>                   </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </p>    \n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/template\" id=\"tpl-manage-asserts\">\n");
      out.write("    <div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-6\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default btn-sm\" id=\"addAssertBtn\">Add Assert</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    <div id=\"assertsWrapper\">\n");
      out.write("    </div>\n");
      out.write("    </script>\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/template\" id=\"tpl-tree-node\">\n");
      out.write("    &nbsp;<div class=\"btn-group menu-arrow\"><button type=\"button\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"fa fa-angle-down\" data-toggle=\"dropdown\"></span></button><ul class=\"dropdown-menu\"><li class=\"edit-node\"><i class=\"fa fa-pencil fa-fw\"></i> Edit Node</li><li class=\"delete-node\"><i class=\"fa fa-trash-o fa-fw\"></i> Delete Node</li><li class=\"copy-node\"><i class=\"fa fa-copy fa-fw\"></i> Copy Node</li><li class=\"run-node\"><i class=\"fa fa-play fa-fw\"></i> Run Node</li></ul></div>\n");
      out.write("    </script>\n");
      out.write("<script type=\"text/template\" id=\"tpl-tree-folder\">\n");
      out.write("    &nbsp;<div class=\"btn-group menu-arrow\"><button type=\"button\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span class=\"fa fa-angle-down\" data-toggle=\"dropdown\"></span></button><ul class=\"dropdown-menu\"><li class=\"edit-node\"><i class=\"fa fa-pencil fa-fw\"></i> Edit Node</li><li class=\"delete-node\"><i class=\"fa fa-trash-o fa-fw\"></i> Delete Node</li><li class=\"copy-node\"><i class=\"fa fa-copy fa-fw\"></i> Copy Node</li><li class=\"run-folder\"><i class=\"fa fa-play fa-fw\"></i> Run Folder</li></ul></div>\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/template\" id = \"tpl-environment-list-item\">\n");
      out.write("       <span><@=conversation.rfRequest.methodType@></span>\n");
      out.write("    </script>\n");
      out.write("<script type=\"text/template\" id=\"tpl-oauth2\">\n");
      out.write("                        <div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-6\">\n");
      out.write("                            <select class=\"form-control existingOAuth\">\n");
      out.write("                                <option value=\"-1\" selected disabled>Select Existing</option>\n");
      out.write("                            </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                        </script>\n");
      out.write("\t<!-- JavaScript -->\n");
      out.write("\t<script data-main=\"js/main\" src=\"js/libs/require/require.js\"></script>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}