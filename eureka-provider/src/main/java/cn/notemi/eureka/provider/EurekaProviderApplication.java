package cn.notemi.eureka.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProviderApplication {

	static Logger logger = LoggerFactory.getLogger(EurekaProviderApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApplication.class, args);
		logger.info("【Spring Cloud Eureka 服务提供者启动完成】");
	}

}

