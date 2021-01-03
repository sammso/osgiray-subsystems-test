package org.osgi.subsystem.serviceone.init;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.err.println(this.getClass().getName() + " - start");

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.err.println(this.getClass().getName() + " - stop");

	}

}
