### JavaWeb

#### Servlet

- 实现流程

  - 新建Class类，并集成自HttpServlet，使用注解标明这是个Servlet

    ```kotlin
    @WebServlet("/test")
    class TestServlet : HttpServlet()
    ```

  - 如果未使用注解，则在web.xml中配置

    ```xml
    <servlet>
      <servlet-name>test</servlet-name>
      <servlet-class>me.jiahuan.java.web.TestServlet</servlet-class>
    </servlet>
    
    <servlet-mapping>
      <servlet-name>test</servlet-name>
      <url-pattern>/test</url-pattern>
    </servlet-mapping>
    ```

- 请求转发

  ```kotlin
  req?.getRequestDispatcher("/login")?.forward(req, resp)
  ```

  整个过程是一个请求，一个响应。

- 重定向

  ```kotlin
  resp?.sendRedirect("/login")
  ```

  整个过程是两个请求，两个响应