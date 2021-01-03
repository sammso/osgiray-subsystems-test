package org.osgiray.subsystems.portletone;

import java.util.Dictionary;
import java.util.Hashtable;

import javax.portlet.Portlet;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		try {
			System.err.println(this.getClass().getName() + " start()");
			Dictionary<String, Object> properties = new Hashtable<>();
			properties.put("javax.portlet.display-name","Portlet Activator One");
			properties.put("com.liferay.portlet.display-category", "category.subsystem");
			properties.put("com.liferay.portlet.instanceable", "true");
			properties.put("javax.portlet.name", "portlet-activator-one");
			properties.put("javax.portlet.security-role-ref", new String[] { "power-user", "user" });

			_serviceRegistration = bundleContext.registerService(Portlet.class, new PortletActivatorOne(), properties);
			System.out.println(this.getClass().getName() + " started()");
		}
		catch (Throwable e) {
			System.err.println("ERROR:" + e.getClass().getName() + " " + e.getMessage());
			e.printStackTrace(System.err);
			if ( e.getCause()!=null) {
				System.err.println(e.getCause().getClass().getName() + " " + e.getCause().getMessage());	
				e.getCause().printStackTrace(System.err);
			}
			throw e;
		}

	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {

		System.err.println(this.getClass().getName() + " stopping()");
		_serviceRegistration.unregister();
		System.err.println(this.getClass().getName() + " stopped()");
	}

	private ServiceRegistration<Portlet> _serviceRegistration;
}
