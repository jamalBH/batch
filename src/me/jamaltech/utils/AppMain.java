package me.jamaltech.utils;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.jamaltech.dao.UserImp;
import me.jamaltech.dao.UserInterf;
import me.jamaltech.entities.User;

public class AppMain {

	public static void main(String[] args) throws Exception{
		
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("me/jamaltech/utils/batch-context.xml");

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		
		Job job = (Job) context.getBean("importUsers");
		
		jobLauncher.run(job, new JobParameters());

		
		
		
		/*User user = new User();
		user.setCivilite("M");
		user.setFirstname("Jamal");
		user.setLastname("Bouhssine");
		
		UserInterf dao = new UserImp();
		dao.addUser(user);*/
		
		
		
	}

}
