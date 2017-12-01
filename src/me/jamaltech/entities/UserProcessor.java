package me.jamaltech.entities;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

@Service("userProcessor")
public class UserProcessor implements ItemProcessor<User, User> {

	public User process(final User userInPut) throws Exception {
		User userOutPut = null;
		
		if("M".equals(userInPut.getCivilite())) {
			userOutPut = new User();
			userOutPut.setCivilite(userInPut.getCivilite());
			userOutPut.setFirstname(userInPut.getFirstname());
			userOutPut.setLastname(userInPut.getLastname());
			userOutPut.setId(userInPut.getId());
		}
		return userOutPut;
	}
}
