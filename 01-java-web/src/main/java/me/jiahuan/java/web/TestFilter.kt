package me.jiahuan.java.web

import javax.servlet.*
import javax.servlet.annotation.WebFilter
import javax.servlet.annotation.WebInitParam

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