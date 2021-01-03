package org.osgiray.subsystems.servicetwo.impl;


import java.util.Date;

import org.osgi.service.component.annotations.Component;
import org.osgi.subsystem.servicetwo.ServiceTwo;

/**
 * @author Sampsa Sohlman <sampsa@sohlman.com>
 */
@Component(
	immediate = true,
	service = ServiceTwo.class
)
public class ServiceTwoImpl implements ServiceTwo {
	public ServiceTwoImpl() {
		System.err.println(this.getClass().getName() + "- constructor");
	}

	@Override
	public String getServiceTwoAnswer() {
		System.err.println(this.getClass().getName() + "- getServiceOneAnswer()");
		return this.getClass().getName() + " " + String.valueOf(new Date());
	}
}