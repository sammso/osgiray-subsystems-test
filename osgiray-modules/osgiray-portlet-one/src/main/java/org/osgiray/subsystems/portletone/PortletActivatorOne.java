package org.osgiray.subsystems.portletone;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author Sampsa Sohlman
 */
public class PortletActivatorOne implements Portlet {

	@Override
	public void init(PortletConfig config) throws PortletException {
		System.err.println(this.getClass().getName() + " init()");
	}

	@Override
	public void processAction(ActionRequest request, ActionResponse response) throws PortletException, IOException {
		System.err.println(this.getClass().getName() + " processAction()");
		
	}

	@Override
	public void render(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		System.err.println(this.getClass().getName() + " response()");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<h1>" + this.getClass().getName() + "<h1><p>Date: " + String.valueOf(new Date()) + "</p>");		
	}

	@Override
	public void destroy() {
		System.err.println(this.getClass().getName() + " response()");
		
	}


}