package th.ac.kmitl.it.se.soa2018.group1.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TaxInvoiceWebApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TaxInvoiceWebApplication.class, args);
	}

}
