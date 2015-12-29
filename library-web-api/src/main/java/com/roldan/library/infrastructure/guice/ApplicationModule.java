package com.roldan.library.infrastructure.guice;

import com.google.inject.AbstractModule;
import com.roldan.library.application.Service;

public class ApplicationModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Service.class);
	}
}