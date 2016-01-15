package org.kyrin.loris_example.controller;

import java.lang.reflect.Method;

import org.kyrin.loris_framework.annatation.Controller;
import org.kyrin.loris_framework.aop.AspectProxy;
import org.kyrin.loris_framework.aop.annatation.Aspect;

/**
 * 拦截所有controller注解的类
 * @author kyrin
 *
 */
@Aspect(Controller.class)
public class ControllerAspect extends AspectProxy {

	@Override
	public void begin() {
		System.out.println("----------begin----------");
	}

	@Override
	public void end() {
		System.out.println("----------end----------");
	}

	@Override
	public boolean intercepter(Class<?> clazz, Method method, Object[] params) {
		return true;
	}

	@Override
	public void before(Class<?> clazz, Method method, Object[] params) {
		System.out.println(String.format("class : %s , method : %s , paramsNum : %d ", clazz.getName(),
				method.getName(), params.length));
	}

	@Override
	public void after(Class<?> clazz, Method method, Object[] params) {
		System.out.println("----------after----------");
	}

}
