package me.jiahuan.java.web

import javax.servlet.ServletContextAttributeListener
import javax.servlet.ServletRequestAttributeListener
import javax.servlet.ServletRequestEvent
import javax.servlet.ServletRequestListener
import javax.servlet.annotation.WebListener
import javax.servlet.http.HttpSessionAttributeListener
import javax.servlet.http.HttpSessionListener

@WebListener
class TestListener : HttpSessionListener, HttpSessionAttributeListener, ServletRequestListener, ServletRequestAttributeListener, ServletContextAttributeListener {
    override fun requestInitialized(sre: ServletRequestEvent?) {
        println("requestInitialized")
    }

    override fun requestDestroyed(sre: ServletRequestEvent?) {
        println("requestDestroyed")
    }
}