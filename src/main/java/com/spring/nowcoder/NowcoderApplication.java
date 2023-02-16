package com.spring.nowcoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
// 扫描Servlet组件
@ServletComponentScan(basePackages = "com.spring.nowcoder")
public class NowcoderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NowcoderApplication.class, args);
    }

}
