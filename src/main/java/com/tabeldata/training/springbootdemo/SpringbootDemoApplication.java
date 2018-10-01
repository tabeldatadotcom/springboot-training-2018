package com.tabeldata.training.springbootdemo;

import com.tabeldata.training.springbootdemo.bean.DataBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext contenxt = SpringApplication.run(SpringbootDemoApplication.class, args);
        
        DataBean bean = contenxt.getBean(DataBean.class);
        System.out.println(bean.toString());
    }
}
