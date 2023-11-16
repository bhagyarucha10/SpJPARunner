package com.example.SpJPARunner;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.SpJPARunner.Model.Student1;
import com.example.SpJPARunner.repo.StudentRepo;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.example.SpJPARunner.Model"})
@EnableJpaRepositories("com.example.SpJPARunner.repo")
public class SpJpaRunnerApplication implements CommandLineRunner{

	
	@Autowired
	StudentRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(SpJpaRunnerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//	Student1 st=new Student1();
	
//st.setName("mENIE");
//	st.setCollege("UVCE");
//st.setPercentage(93);
//	repo.save(st);
//	System.out.println("entity saved");
	//	List<Student1> st2=repo.findByNameContaining('A');
	//	System.out.println(st2);
	//	List<Integer> l=repo.findpercentageByName("ANNIE");
	//	System.out.println(l);
	}

}
