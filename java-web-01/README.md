#### Servlet

- 实现

  ```kotlin
  @WebServlet(urlPatterns = ["/test"])
  class TestServlet : HttpServlet() {
      override fun service(req: HttpServletRequest?, resp: HttpServletResponse?) {
          println("TestServlet")
      }
  }
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

#### Filter

```kotlin
@WebFilter(urlPatterns = ["*"], initParams = [WebInitParam(name = "test", value = "初始值")])
class TestFilter : Filter {
    override fun init(filterConfig: FilterConfig?) {
        println("TestFilter init")
        val initValue = filterConfig?.getInitParameter("test")
        println("initValue = $initValue")
    }

    override fun doFilter(req: ServletRequest?, resp: ServletResponse?, chain: FilterChain?) {
        println("TestFilter doFilter")
        resp?.contentType = "text/html;charset=UTF-8";
        resp?.characterEncoding = "UTF-8";

        chain?.doFilter(req, resp)
    }

    override fun destroy() {
        println("TestFilter destroy")
    }
}
```

#### Listener

```kotlin
@WebListener
class TestListener : HttpSessionListener, HttpSessionAttributeListener, ServletRequestListener, ServletRequestAttributeListener, ServletContextAttributeListener {
    override fun requestInitialized(sre: ServletRequestEvent?) {
        println("requestInitialized")
    }

    override fun requestDestroyed(sre: ServletRequestEvent?) {
        println("requestDestroyed")
    }
}	
```



