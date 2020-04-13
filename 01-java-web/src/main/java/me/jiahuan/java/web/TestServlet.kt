package me.jiahuan.java.web

import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet("/test")
class TestServlet : HttpServlet() {
    override fun service(req: HttpServletRequest?, resp: HttpServletResponse?) {
        println("TestServlet")
//        req?.getRequestDispatcher("/login")?.forward(req, resp)
//        resp?.sendRedirect("/login")
    }
}