/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2024-11-11 13:09:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ohora;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orderlist_005flog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1730336729000L));
    _jspx_dependants.put("jar:file:/C:/Users/USER/Desktop/OhoraTest/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/projectOhora/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>오호라</title>\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"http://localhost/jspPro/images/SiSt.ico\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"google\" content=\"notranslate\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/projectOhora/resources/cdn-main/orderlist_log.css\">\r\n");
      out.write("<script src=\"http://localhost/jspPro/resources/cdn-main/example.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(" span.material-symbols-outlined{\r\n");
      out.write("    vertical-align: text-bottom;\r\n");
      out.write(" }  \r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <img\r\n");
      out.write("      src=\"https://www.ohora.kr/optimize/images/pc/common/PC_header_kakao_0526.webp\"\r\n");
      out.write("      alt=\"\"\r\n");
      out.write("      class=\"header\"\r\n");
      out.write("      style\r\n");
      out.write("      width=\"100%\"\r\n");
      out.write("    />\r\n");
      out.write("    <header>\r\n");
      out.write("      <div class=\"SP_top_wrap\">\r\n");
      out.write("        <div class=\"layout_Top\">\r\n");
      out.write("          <div\r\n");
      out.write("            class=\"xans-element- xans-layout xans-layout-statelogoff SP_gnb_inr\"\r\n");
      out.write("          >\r\n");
      out.write("            <a href=\"\"><span class=\"title\">회원가입 &nbsp;&nbsp;|</span></a>\r\n");
      out.write("            <a href=\"\" class=\"log\"><span class=\"title\">로그인</span></a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div id=\"nav\">\r\n");
      out.write("        <div>\r\n");
      out.write("          <div class=\"SMS_fixed_inner\">\r\n");
      out.write("            <div\r\n");
      out.write("              class=\"xans-element- xans-layout xans-layout-logotop fixed_logo\"\r\n");
      out.write("            >\r\n");
      out.write("              <a href=\"/\" style=\"display: block; text-align: center\">\r\n");
      out.write("                <img\r\n");
      out.write("                  src=\"https://ohora.kr/web/upload/logo/ohora_BI_logotype_w.png\"\r\n");
      out.write("                  id=\"navLogo\"\r\n");
      out.write("                />\r\n");
      out.write("              </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- 헤더 주메뉴 -->\r\n");
      out.write("            <div class=\"gnb_menu_container no-hover\">\r\n");
      out.write("              <ul class=\"gnb_menu_wrap menu_1ul\">\r\n");
      out.write("                <li class=\"eng_font menu_1li submenu\">\r\n");
      out.write("                  <a href=\"/product/list.html?cate_no=121\">new</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"eng_font menu_1li submenu\">\r\n");
      out.write("                  <a href=\"/product/list.html?cate_no=120\">best</a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"product\">\r\n");
      out.write("                  <a href=\"/product/list.html?cate_no=44\">product</a>\r\n");
      out.write("                  <!-- 마우스 오버 시 나오는 영역(product) -->\r\n");
      out.write("                  <ul class=\"menu_2ul\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                      <a href=\"/product/list.html?cate_no=160\"\r\n");
      out.write("                        ><span>네일</span></a\r\n");
      out.write("                      >\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                      <a href=\"/product/list.html?cate_no=161\"\r\n");
      out.write("                        ><span>페디</span></a\r\n");
      out.write("                      >\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                      <a href=\"/product/list.html?cate_no=470\"\r\n");
      out.write("                        ><span>커스텀</span></a\r\n");
      out.write("                      >\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                      <a href=\"/product/list.html?cate_no=49\"\r\n");
      out.write("                        ><span>케어 &amp; 툴</span></a\r\n");
      out.write("                      >\r\n");
      out.write("                    </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                  <!-- //마우스 오버 시 나오는 영역(product) -->\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"eng_font menu_1li submenu\">\r\n");
      out.write("                  <a href=\"/product/list.html?cate_no=671\">outlet</a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <!-- 마우스 오버 시 나오는 영역(2+1) -->\r\n");
      out.write("                <ul class=\"menu_2ul\"></ul>\r\n");
      out.write("                <!-- //마우스 오버 시 나오는 영역(2+1) -->\r\n");
      out.write("                <li class=\"eng_font\">\r\n");
      out.write("                  <a href=\"/event/index.html\">event</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"eng_font\">\r\n");
      out.write("                  <a href=\"/board/gallery/list.html?board_no=13\">how to</a>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- //헤더 주메뉴 -->\r\n");
      out.write("            <div class=\"icon_wrap\">\r\n");
      out.write("              <div class=\"small_icon search_fixed_btn\">\r\n");
      out.write("                <img\r\n");
      out.write("                  src=\"https://ohora.kr/web/upload/common/icon_ham_search.svg\"\r\n");
      out.write("                  alt=\"\"\r\n");
      out.write("                />\r\n");
      out.write("              </div>\r\n");
      out.write("              <div\r\n");
      out.write("                class=\"xans-element- xans-layout xans-layout-orderbasketcount small_icon m_cart common_cart\"\r\n");
      out.write("              >\r\n");
      out.write("                <a href=\"/order/basket.html\"\r\n");
      out.write("                  ><b class=\"count EC-Layout-Basket-count\">0</b>\r\n");
      out.write("                  <img\r\n");
      out.write("                    src=\"https://ohora.kr/web/upload/common/icon_cart.svg\"\r\n");
      out.write("                    alt=\"\"\r\n");
      out.write("                /></a>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"small_icon m_menu active\">\r\n");
      out.write("                <a class=\"SMS_menu\">\r\n");
      out.write("                  <img\r\n");
      out.write("                    src=\"https://ohora.kr/web/upload/common/icon_menu.svg\"\r\n");
      out.write("                    alt=\"\"\r\n");
      out.write("                  />\r\n");
      out.write("                </a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <!-- 콘텐츠 -->\r\n");
      out.write("    <div id=\"contents\">\r\n");
      out.write("      <script>\r\n");
      out.write("        SMARTPC_GLOBAL_OBJECT.page = \"mypage\";\r\n");
      out.write("      </script>\r\n");
      out.write("      <div id=\"SP_mypage_wrap\">\r\n");
      out.write("        <div class=\"SP_subSection large\">\r\n");
      out.write("          <h2 class=\"SP_subTitle\"><span class=\"eng_font\">order</span></h2>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"SP_layoutFix\">\r\n");
      out.write("          <div\r\n");
      out.write("            class=\"xans-element- xans-myshop xans-myshop-orderhistorytab SP_myOrderlist_tab\"\r\n");
      out.write("          >\r\n");
      out.write("            <ul class=\"menu\">\r\n");
      out.write("              <li class=\"tab_class selected\">\r\n");
      out.write("                <a href=\"\"\r\n");
      out.write("                  >주문내역조회 (<span id=\"xans_myshop_total_orders\">0</span\r\n");
      out.write("                  >)</a\r\n");
      out.write("                >\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"tab_class_cs\">\r\n");
      out.write("                <a href=\"../orderlist_cancel/orderlist_cancel.html\"\r\n");
      out.write("                  >취소/반품/교환 내역 (<span id=\"xans_myshop_total_orders_cs\"\r\n");
      out.write("                    >0</span\r\n");
      out.write("                  >)</a\r\n");
      out.write("                >\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <form method=\"GET\" id=\"OrderHistoryForm\" name=\"OrderHistoryForm\">\r\n");
      out.write("            <div\r\n");
      out.write("              class=\"xans-element- xans-myshop xans-myshop-orderhistoryhead SP_myOrderlist_srh\"\r\n");
      out.write("            >\r\n");
      out.write("              <fieldset class=\"SP_myOrderlist_fildeset\">\r\n");
      out.write("                <legend>검색기간설정</legend>\r\n");
      out.write("                <div class=\"stateSelect SP_myOrderlist_li SP_ordSrh_chooseSel\">\r\n");
      out.write("                  <select id=\"order_status\" name=\"order_status\" class=\"fSelect\">\r\n");
      out.write("                    <option value=\"all\">전체 주문처리상태</option>\r\n");
      out.write("                    <option value=\"shipped_before\">입금전</option>\r\n");
      out.write("                    <option value=\"shipped_standby\">배송준비중</option>\r\n");
      out.write("                    <option value=\"shipped_begin\">배송중</option>\r\n");
      out.write("                    <option value=\"shipped_complate\">배송완료</option>\r\n");
      out.write("                    <option value=\"order_cancel\">취소</option>\r\n");
      out.write("                    <option value=\"order_exchange\">교환</option>\r\n");
      out.write("                    <option value=\"order_return\">반품</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"SP_myOrderlist_li SP_ordSrh_chooseBtn\">\r\n");
      out.write("                  <a href=\"#none\" class=\"SP_cm_btn SP_btn_gray_bd\" days=\"00\"\r\n");
      out.write("                    >오늘</a\r\n");
      out.write("                  >\r\n");
      out.write("                  <a href=\"#none\" class=\"SP_cm_btn SP_btn_gray_bd\" days=\"07\"\r\n");
      out.write("                    >1주일</a\r\n");
      out.write("                  >\r\n");
      out.write("                  <a href=\"#none\" class=\"SP_cm_btn SP_btn_gray_bd\" days=\"30\"\r\n");
      out.write("                    >1개월</a\r\n");
      out.write("                  >\r\n");
      out.write("                  <a href=\"#none\" class=\"SP_cm_btn SP_btn_gray_bd\" days=\"90\"\r\n");
      out.write("                    >3개월</a\r\n");
      out.write("                  >\r\n");
      out.write("                  <a href=\"#none\" class=\"SP_cm_btn SP_btn_gray_bd\" days=\"180\"\r\n");
      out.write("                    >6개월</a\r\n");
      out.write("                  >\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"SP_myOrderlist_li SP_ordSrh_chooseSel\">\r\n");
      out.write("                  <span class=\"SP_startday\"\r\n");
      out.write("                    ><input\r\n");
      out.write("                      id=\"history_start_date\"\r\n");
      out.write("                      name=\"history_start_date\"\r\n");
      out.write("                      class=\"fText hasDatepicker\"\r\n");
      out.write("                      readonly=\"readonly\"\r\n");
      out.write("                      size=\"10\"\r\n");
      out.write("                      value=\"2024-07-29\"\r\n");
      out.write("                      type=\"text\" /><button\r\n");
      out.write("                      type=\"button\"\r\n");
      out.write("                      class=\"ui-datepicker-trigger\"\r\n");
      out.write("                    >\r\n");
      out.write("                      <img\r\n");
      out.write("                        src=\"//img.echosting.cafe24.com/skin/admin_ko_KR/myshop/ico_cal.gif\"\r\n");
      out.write("                        alt=\"...\"\r\n");
      out.write("                        title=\"...\"\r\n");
      out.write("                      /></button></span\r\n");
      out.write("                  ><span class=\"SP_extraTxt\">~</span\r\n");
      out.write("                  ><span class=\"SP_endday\"\r\n");
      out.write("                    ><input\r\n");
      out.write("                      id=\"history_end_date\"\r\n");
      out.write("                      name=\"history_end_date\"\r\n");
      out.write("                      class=\"fText hasDatepicker\"\r\n");
      out.write("                      readonly=\"readonly\"\r\n");
      out.write("                      size=\"10\"\r\n");
      out.write("                      value=\"2024-10-27\"\r\n");
      out.write("                      type=\"text\" /><button\r\n");
      out.write("                      type=\"button\"\r\n");
      out.write("                      class=\"ui-datepicker-trigger\"\r\n");
      out.write("                    >\r\n");
      out.write("                      <img\r\n");
      out.write("                        src=\"//img.echosting.cafe24.com/skin/admin_ko_KR/myshop/ico_cal.gif\"\r\n");
      out.write("                        alt=\"...\"\r\n");
      out.write("                        title=\"...\"\r\n");
      out.write("                      /></button\r\n");
      out.write("                  ></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"SP_myOrderlist_li SP_ordSrh_chooseSubmit\">\r\n");
      out.write("                  조회<span\r\n");
      out.write("                    ><input\r\n");
      out.write("                      alt=\"조회\"\r\n");
      out.write("                      id=\"order_search_btn\"\r\n");
      out.write("                      type=\"image\"\r\n");
      out.write("                      src=\"//img.echosting.cafe24.com/skin/admin_ko_KR/myshop/btn_search.gif\"\r\n");
      out.write("                  /></span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </fieldset>\r\n");
      out.write("              <ul class=\"SP_orderlist_srh_guide\">\r\n");
      out.write("                <li>\r\n");
      out.write("                  기본적으로 최근 3개월간의 자료가 조회되며, 기간 검색시 지난\r\n");
      out.write("                  주문내역을 조회하실 수 있습니다.\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  주문번호를 클릭하시면 해당 주문에 대한 상세내역을 확인하실 수\r\n");
      out.write("                  있습니다.\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"\">\r\n");
      out.write("                  취소/교환/반품 신청은 배송완료일 기준 7일까지 가능합니다.\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <input id=\"mode\" name=\"mode\" value=\"\" type=\"hidden\" />\r\n");
      out.write("            <input id=\"term\" name=\"term\" value=\"\" type=\"hidden\" />\r\n");
      out.write("          </form>\r\n");
      out.write("          <div\r\n");
      out.write("            class=\"xans-element- xans-myshop xans-myshop-orderhistorylistitem SP_subSection\"\r\n");
      out.write("          >\r\n");
      out.write("            <!--\r\n");
      out.write("            $login_url = /member/login.html\r\n");
      out.write("          -->\r\n");
      out.write("            <h3 class=\"SP_contTitle\">주문 목록</h3>\r\n");
      out.write("            <table border=\"1\" summary=\"\" class=\"SP_tableSt01_isThumNail\">\r\n");
      out.write("              <colgroup>\r\n");
      out.write("                <col style=\"width: 200px\" />\r\n");
      out.write("                <col style=\"width: 120px\" />\r\n");
      out.write("                <col style=\"width: auto\" />\r\n");
      out.write("                <col style=\"width: 70x\" />\r\n");
      out.write("                <col style=\"width: 120px\" />\r\n");
      out.write("                <col style=\"width: 150px\" />\r\n");
      out.write("                <col style=\"width: 160px\" />\r\n");
      out.write("                <col style=\"width: 110px\" />\r\n");
      out.write("              </colgroup>\r\n");
      out.write("              <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <th scope=\"col\">주문일자 [주문번호]</th>\r\n");
      out.write("                  <th scope=\"col\">이미지</th>\r\n");
      out.write("                  <th scope=\"col\">상품정보</th>\r\n");
      out.write("                  <th scope=\"col\">수량</th>\r\n");
      out.write("                  <th scope=\"col\">상품구매금액</th>\r\n");
      out.write("                  <th scope=\"col\">주문처리상태</th>\r\n");
      out.write("                  <th scope=\"col\">취소/교환/반품</th>\r\n");
      out.write("                  <th scope=\"col\">주문취소</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </thead>\r\n");
      out.write("            </table>\r\n");
      out.write("            <p class=\"SP_message\">주문 내역이 없습니다.</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- cre.ma / init 스크립트 (PC) / 스크립트를 수정할 경우 연락주세요 (support@cre.ma) -->\r\n");
      out.write("      <script>\r\n");
      out.write("        (function (i, s, o, g, r, a, m) {\r\n");
      out.write("          if (s.getElementById(g)) {\r\n");
      out.write("            return;\r\n");
      out.write("          }\r\n");
      out.write("          (a = s.createElement(o)), (m = s.getElementsByTagName(o)[0]);\r\n");
      out.write("          a.id = g;\r\n");
      out.write("          a.async = 1;\r\n");
      out.write("          a.src = r;\r\n");
      out.write("          m.parentNode.insertBefore(a, m);\r\n");
      out.write("        })(\r\n");
      out.write("          window,\r\n");
      out.write("          document,\r\n");
      out.write("          \"script\",\r\n");
      out.write("          \"crema-jssdk\",\r\n");
      out.write("          \"//widgets.cre.ma/ohora.kr/init.js\"\r\n");
      out.write("        );\r\n");
      out.write("      </script>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 아래 필수 -->\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("      <div class=\"chat\">\r\n");
      out.write("        <div class=\"top_left\">\r\n");
      out.write("          <span class=\"kakao_chat\">\r\n");
      out.write("            <a href=\"https://www.ohora.kr/etc/CS.html\"\r\n");
      out.write("              >카카오톡 상담 (@ohora)</a\r\n");
      out.write("            >\r\n");
      out.write("          </span>\r\n");
      out.write("          <span class=\"center_chat\">\r\n");
      out.write("            <a\r\n");
      out.write("              href=\"https://www.ohora.kr/member/login.html?returnUrl=%2Fboard%2Fconsult%2Flist.html%3Fboard_no%3D9\"\r\n");
      out.write("              >게시판 상담 (1:1 문의하기)</a\r\n");
      out.write("            >\r\n");
      out.write("          </span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"top_right\">\r\n");
      out.write("          <a href=\"https://www.instagram.com/ohora_official/\" target=\"_blank\">\r\n");
      out.write("            <img src=\"../image/1.png\" />\r\n");
      out.write("          </a>\r\n");
      out.write("          <a href=\"https://www.facebook.com/ohora.official\" target=\"_blank\">\r\n");
      out.write("            <img src=\"../image/2.png\" />\r\n");
      out.write("          </a>\r\n");
      out.write("          <a href=\"https://pf.kakao.com/_axjYfj\" target=\"_blank\">\r\n");
      out.write("            <img src=\"../image/3.png\" />\r\n");
      out.write("          </a>\r\n");
      out.write("          <a\r\n");
      out.write("            href=\"https://www.youtube.com/channel/UCV72a2QWRpEZjZYkWjXHZWQ\"\r\n");
      out.write("            target=\"_blank\"\r\n");
      out.write("          >\r\n");
      out.write("            <img src=\"../image/4.png\" />\r\n");
      out.write("          </a>\r\n");
      out.write("          <a\r\n");
      out.write("            href=\"https://post.naver.com/my.nhn?memberNo=47439708\"\r\n");
      out.write("            target=\"_blank\"\r\n");
      out.write("          >\r\n");
      out.write("            <img src=\"../image/5.png\" />\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <br />\r\n");
      out.write("      <div class=\"line\"></div>\r\n");
      out.write("      <div class=\"center_menu\">\r\n");
      out.write("        <div class=\"list\" id=\"a\">\r\n");
      out.write("          주문\r\n");
      out.write("          <div class=\"sub\" id=\"aa\">\r\n");
      out.write("            <a\r\n");
      out.write("              href=\"https://www.ohora.kr/member/login.html?returnUrl=/myshop/order/list.html\"\r\n");
      out.write("              >주문·배송내역</a\r\n");
      out.write("            ><br /><br />\r\n");
      out.write("            <a\r\n");
      out.write("              href=\"https://www.ohora.kr/member/login.html?returnUrl=/myshop/order/list.html?mode=cs\"\r\n");
      out.write("              >취소/교환/반품내역</a\r\n");
      out.write("            ><br /><br />\r\n");
      out.write("            <a href=\"https://www.ohora.kr/order/basket.html\">장바구니</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"line\"></div>\r\n");
      out.write("      <div class=\"center_menu\">\r\n");
      out.write("        <div class=\"list\" id=\"b\">\r\n");
      out.write("          회원\r\n");
      out.write("          <div class=\"sub\" id=\"bb\">\r\n");
      out.write("            <a href=\"#\">신규 혜택</a><br /><br />\r\n");
      out.write("            <a href=\"#\">멤버십 혜택</a><br /><br />\r\n");
      out.write("            <a href=\"#\">마이페이지</a><br /><br />\r\n");
      out.write("            <a href=\"#\">적립금·쿠폰내역</a><br /><br />\r\n");
      out.write("            <a href=\"#\">회원정보변경</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"line\"></div>\r\n");
      out.write("      <div class=\"center_menu\">\r\n");
      out.write("        <div class=\"list\" id=\"c\">\r\n");
      out.write("          서비스\r\n");
      out.write("          <div class=\"sub\" id=\"cc\">\r\n");
      out.write("            <a href=\"#\">FAQ</a><br /><br />\r\n");
      out.write("            <a href=\"#\">상담톡</a><br /><br />\r\n");
      out.write("            <a href=\"#\">사용법</a><br /><br />\r\n");
      out.write("            <a href=\"#\">공지사항</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"line\"></div>\r\n");
      out.write("      <div class=\"company\">\r\n");
      out.write("        <p>\r\n");
      out.write("          대표 : 유기현<br />\r\n");
      out.write("          회사 : 주식회사 글루가<br />\r\n");
      out.write("          주소 : 충남 천안시 서북구 2공단8길 45 2층 (업성동)<br />\r\n");
      out.write("          사업자등록번호 : 722-87-00061<br />\r\n");
      out.write("          통신판매업신고번호 : 2017-충남천안-1055호 사업자 정보 확인<br />\r\n");
      out.write("          개인정보처리담당자 : 유태규<br />\r\n");
      out.write("          고객센터 : 1566-0554<br />\r\n");
      out.write("          평일 09:00~18:00 (Lunch 12:30~13:30)<br />\r\n");
      out.write("          영업문의 : ohora_official@ohora.com<br />\r\n");
      out.write("          제휴 & 파트너십 문의 : ohora_partnership@ohora.com<br />\r\n");
      out.write("          글로벌 제휴 & 파트너십 문의 : Global-Business@ohora.com\r\n");
      out.write("        </p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"line\"></div>\r\n");
      out.write("      <div class=\"bottom\">\r\n");
      out.write("        <span class=\"a\"><a href=\"#\">브랜드 소개</a></span>\r\n");
      out.write("        <span class=\"b\"><a href=\"#\">이용약관</a></span>\r\n");
      out.write("        <span class=\"c\"><a href=\"#\">개인정보처리방침</a></span>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("      (function (i, s, o, g, r, a, m) {\r\n");
      out.write("        if (s.getElementById(g)) {\r\n");
      out.write("          return;\r\n");
      out.write("        }\r\n");
      out.write("        (a = s.createElement(o)), (m = s.getElementsByTagName(o)[0]);\r\n");
      out.write("        a.id = g;\r\n");
      out.write("        a.async = 1;\r\n");
      out.write("        a.src = r;\r\n");
      out.write("        m.parentNode.insertBefore(a, m);\r\n");
      out.write("      })(\r\n");
      out.write("        window,\r\n");
      out.write("        document,\r\n");
      out.write("        \"script\",\r\n");
      out.write("        \"crema-jssdk\",\r\n");
      out.write("        \"//widgets.cre.ma/ohora.kr/init.js\"\r\n");
      out.write("      );\r\n");
      out.write("    </script>\r\n");
      out.write("    <!-- 메인 전체 컨테이너 -->\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
