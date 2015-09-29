public class LoginFormServet extends HttpServlet {

  private String loginFormUri;

  @Override
  public void init() {
      ServletConfig conf = getServletConfig();
      loginFormUri = conf.getInitParameter("login-form-uri");
  }

  @Override
  public void service(HttpServletRequest request,
      HttpServletResponse response) throws Exception {
      loginForm(response);
  }

  private void loginForm(HttpServletResponse response)
      throws Exception {

      Writer writer = null;
      BufferedReader reader = null;

      try {
          URL url = new URL(loginFormUri);
          URLConnection conn = url.openConnection();
          reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
          writer = response.getWriter();
          String line;
          while ((line = reader.readLine()) != null) {
              writer.append(line);
          }
      } finally {
          if (writer != null) {
              writer.flush();
          }
          if (reader != null) {
              reader.close();
          }
      }
  }
}