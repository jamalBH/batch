package me.jamaltech.entities;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.jamaltech.dao.UserImp;
import me.jamaltech.dao.UserInterf;

@Service("userWriter")
public class UserWriter implements ItemWriter<User> {

	
	private UserInterf dao = new UserImp();
	
	
	public void setDao(UserInterf dao){this.dao=dao;	}
	
	@Override
	public void write(List<? extends User> arg0) throws Exception {
		for(User user : arg0){
			dao.addUser(user);
			System.out.println("*******************One user wase added******************");
		}
		
	}

}
