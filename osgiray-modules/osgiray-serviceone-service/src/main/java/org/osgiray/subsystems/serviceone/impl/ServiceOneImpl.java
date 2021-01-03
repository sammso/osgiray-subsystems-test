package org.osgiray.subsystems.serviceone.impl;


import java.util.Date;

import org.osgi.service.component.annotations.Component;
import org.osgi.subsystem.serviceone.ServiceOne;

/**
 * @author Sampsa Sohlman <sampsa@sohlman.com>
 */
@Component(
	immediate = true,
	service = ServiceOne.class
)
public class ServiceOneImpl implements ServiceOne {
	public ServiceOneImpl() {
		System.err.println(this.getClass().getName() + " - constructor");
	}

	@Override
	public String getServiceOneAnswer() {
		return this.getClass().getName() + " " + String.valueOf(new Date());
	}
}