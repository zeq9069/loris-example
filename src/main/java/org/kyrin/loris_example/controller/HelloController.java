package org.kyrin.loris_example.controller;

import java.util.HashMap;
import java.util.Map;

import org.kyrin.loris_framework.annatation.Action;
import org.kyrin.loris_framework.annatation.Controller;
import org.kyrin.loris_framework.core.Param;
import org.kyrin.loris_framework.data.Data;
import org.kyrin.loris_framework.data.View;

/**
 * @author kyrin
 *
 */
@Controller
public class HelloController {

	@Action(value = "get:/time")
	public Data currentTime(Param paramMap) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("time", System.currentTimeMillis());
		Data data = new Data(model);
		return data;
	}
	
	@Action(value = "get:/timejsp")
	public View currentTimejsp(Param paramMap) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("date", System.currentTimeMillis());
		View view=new View("index.jsp");
		view.setModel(model);
		return view;
	}
	
}
