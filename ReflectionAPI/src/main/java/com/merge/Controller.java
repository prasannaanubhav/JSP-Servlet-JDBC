package com.merge;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

	@GetMapping(path = { "/user/{name}", "/user/{name}/{id}" })
	public Object getUserbyUserName(@PathVariable("name") String name, @PathVariable("id") Optional<String> id)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
			SecurityException, InstantiationException {

		if (id.isPresent()) {
			return Serviceimpl.class.getMethod("getNameAndId", new Class[] { String.class, String.class })
					.invoke(Serviceimpl.class.newInstance(), new Object[] { name, id.get() });
		}

		return Serviceimpl.class.getMethod("getName", new Class[] { String.class })
				.invoke(Serviceimpl.class.newInstance(), new Object[] { name });
	}

}
