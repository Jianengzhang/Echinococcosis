package com.hdu.Echinococcosis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.servlet.MultipartConfigElement;
@Configuration
@SpringBootApplication
@EnableCaching //启用缓存
@EnableScheduling //启用定时任务
@EnableAsync //启用异步执行注解
@MapperScan("com.edu.Echinococcosis.modules.*.dao")//配置Mapper接口类扫描路径
public class EchinococcosisApplication extends SpringBootServletInitializer {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EchinococcosisApplication.class);
	}

	public static void main(String[] args)throws Exception {
		SpringApplication.run(EchinococcosisApplication.class, args);
	}
}