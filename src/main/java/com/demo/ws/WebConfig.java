package com.demo.ws;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@Configuration
public class WebConfig implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext container) {
        // Create the 'root' Spring application context


        AnnotationConfigWebApplicationContext context
                = new AnnotationConfigWebApplicationContext();
        context.register(ServiceConfiguration.class);
        container.addListener(new ContextLoaderListener(context));
        ServletRegistration.Dynamic dispatcher
                = container.addServlet("dispatcher", new CXFServlet());
        dispatcher.addMapping("/services/*");

    }


}
