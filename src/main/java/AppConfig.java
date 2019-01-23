import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shariqparwez.repository.CustomerRepository;
import com.shariqparwez.repository.HibernateCustomerRepositoryImpl;
import com.shariqparwez.service.CustomerService;
import com.shariqparwez.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.shariqparwez"})
public class AppConfig {
	
	/*@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		CustomerServiceImpl service = new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRepository());
		return service;
	}*/
	
	/*@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}*/
}
