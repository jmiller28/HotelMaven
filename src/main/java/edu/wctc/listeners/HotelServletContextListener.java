package edu.wctc.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author John
 */
public class HotelServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext ctx = sce.getServletContext();
        synchronized (ctx) {
            ctx.setAttribute("driver.class", ctx.getInitParameter("driver.class"));
            ctx.setAttribute("url", ctx.getInitParameter("url"));
            ctx.setAttribute("username", ctx.getInitParameter("username"));
            ctx.setAttribute("password", ctx.getInitParameter("password"));
            ctx.setAttribute("hotel.dao", ctx.getInitParameter("hotel.dao"));
            ctx.setAttribute("hotel.db", ctx.getInitParameter("hotel.db"));
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // nothing to do here
    }

}
