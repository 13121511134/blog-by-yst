package yt.cn.log;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SolrApplication {
   

	public static void main(String[] args) {
		new SpringApplicationBuilder(SolrApplication.class).web(true).run(args);
	}

}
