package cn.notemi.eureka.register.instance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaRegisterInstanceApplication {

	static Logger logger = LoggerFactory.getLogger(EurekaRegisterInstanceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EurekaRegisterInstanceApplication.class, args);
		logger.info("【Spring Cloud Eureka 服务提供者启动完成】");
	}

}

