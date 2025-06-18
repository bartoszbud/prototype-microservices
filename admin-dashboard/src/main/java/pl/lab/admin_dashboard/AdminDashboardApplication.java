package pl.lab.admin_dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableAdminServer
public class AdminDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminDashboardApplication.class, args);
	}

}
