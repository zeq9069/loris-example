package org.kyrin.loris_example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kyrin.loris_example.service.UserService;
import org.kyrin.loris_framework.annatation.Action;
import org.kyrin.loris_framework.annatation.Controller;
import org.kyrin.loris_framework.annatation.Inject;
import org.kyrin.loris_framework.core.Param;
import org.kyrin.loris_framework.data.Data;
import org.kyrin.loris_framework.data.View;

/**
 * @author kyrin
 *
 */
@Controller
public class HelloController {
	
	
	@Inject
	private UserService userService;

	@Action(value = "get:/time")
	public Data currentTime() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("time", System.currentTimeMillis());
		Data data = new Data(model);
		return data;
	}
	
	@Action(value = "get:/timejsp")
	public View currentTimejsp() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("date", System.currentTimeMillis());
		View view=new View("index.jsp");
		view.setModel(model);
		return view;
	}
	
	@Action(value="get:/user")
	public Data getUser(Param paramMap){
		int id=paramMap.getInt("id");
		List<Map<String,Object>> result=userService.getUser(id);
		Data data=new Data(result);
		return data;
	}
	
	
}
