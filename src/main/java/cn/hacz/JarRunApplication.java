package cn.hacz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
@RestController
public class JarRunApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(JarRunApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("后台启动...");
        while (true) {
            Thread.sleep(600000000);
        }
    }

    @PostConstruct
    public void test() {
        System.out.println("PostConstruct");
    }

    @GetMapping(value = "/test")
    public String test01() {
        return "test";
    }
}