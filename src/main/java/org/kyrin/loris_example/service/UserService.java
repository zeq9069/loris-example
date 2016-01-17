package org.kyrin.loris_example.service;

import java.util.List;
import java.util.Map;

import org.kyrin.loris_framework.annatation.Service;
import org.kyrin.loris_framework.transaction.Transaction;
import org.kyrin.loris_framework.utils.DatabaseHelper;

@Service
public class UserService {
	
	@Transaction
	public List<Map<String,Object>> getUser(int id){
		return DatabaseHelper.executeQuery("select * from loris_user where id= ?",id);
	}
}
