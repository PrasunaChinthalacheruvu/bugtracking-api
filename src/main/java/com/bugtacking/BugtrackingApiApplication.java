package com.bugtacking;

import com.bugtacking.actuator.ReportServiceHealth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;


@EnableCaching
@SpringBootApplication
public class BugtrackingApiApplication {
	private static final Logger LOGGER= LoggerFactory.getLogger(BugtrackingApiApplication.class);


	public static void main(String[] args) {
		//change made from git remote
		System.out.println("changes made in IDE to test git push");

        System.out.println("changes-1 made in IDE to test git push");
        System.out.println("changes-2 made in IDE to test git push");
		SpringApplication.run(BugtrackingApiApplication.class, args);
		LOGGER.debug("Application has been started");
		System.out.println("Changed file, git test");
	}

}
