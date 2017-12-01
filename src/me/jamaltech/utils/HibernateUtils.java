package me.jamaltech.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import me.jamaltech.entities.User;

public class HibernateUtils {
	//Property based configuration
			private static SessionFactory sessionFactory;

			private static SessionFactory buildSessionFactory() {
				try {
					Configuration configuration = new Configuration();

					//Create Properties, can be read from property files too
					Properties props = new Properties();
					props.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
					props.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/data");
					props.put("hibernate.connection.username", "root");
					props.put("hibernate.connection.password", "");
					props.put("hibernate.current_session_context_class", "thread");
					props.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
					props.put("hibernate.hbm2ddl.auto", "update");
					props.put("hibernate.show_sql", "true");


					configuration.setProperties(props);

					//we can set mapping file or class with annotation
					configuration.addAnnotatedClass(User.class);
			

					ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
					System.out.println("Hibernate  serviceRegistry created");

					SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

					return sessionFactory;
				}
				catch (Throwable ex) {
					System.err.println("Initial SessionFactory creation failed." + ex);
					throw new ExceptionInInitializerError(ex);
				}
			}

			public static SessionFactory getSessionFactory() {
				if(sessionFactory == null) sessionFactory = buildSessionFactory();
				return sessionFactory;
			}
}
