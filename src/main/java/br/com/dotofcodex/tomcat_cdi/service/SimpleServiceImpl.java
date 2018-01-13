package br.com.dotofcodex.tomcat_cdi.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SimpleServiceImpl implements SimpleService {

	private Long counter;

	public SimpleServiceImpl() {
		this.counter = 0l;
	}

	@Override
	public void getMessage(String name) {
		System.out.println("Contador: " + counter);
		System.out.println("Olá: " + name);
		counter++;
	}

}
