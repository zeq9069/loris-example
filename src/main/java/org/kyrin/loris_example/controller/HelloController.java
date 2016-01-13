package org.kyrin.loris_example.controller;

import java.util.HashMap;
import java.util.Map;

import org.kyrin.loris_framework.annatation.Action;
import org.kyrin.loris_framework.annatation.Controller;
import org.kyrin.loris_framework.data.Data;

/**
 * @author kyrin
 *
 */
@Controller
public class HelloController {

	@Action(value = "get:/time")
	public Data currentTime() {
		Map<String, String> model = new HashMap<String, String>();
		model.put("time", "2016-1-13");
		Data data = new Data(model);
		return data;
	}
}
