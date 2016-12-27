package com.yuapt.zipkin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

import javax.annotation.PostConstruct;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication {


	@Value("${qiniu.url}")
	private String driverClassName;


	@Value("${upload.url}")
	private String url;

	@PostConstruct
	public void show() {
		System.out.println("driverClassName=" + driverClassName);
		System.out.println("url=" + url);
	}
	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
	}
}
