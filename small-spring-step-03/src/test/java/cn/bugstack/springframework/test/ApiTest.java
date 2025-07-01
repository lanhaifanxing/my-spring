package cn.bugstack.springframework.test;

import cn.bugstack.springframework.factory.config.BeanDefinition;
import cn.bugstack.springframework.factory.support.DefaultListableBeanFactory;
import cn.bugstack.springframework.test.bean.UserService;
import org.junit.Test;

import java.io.IOException;

public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.第一次获取 bean
//        UserService userService = (UserService) beanFactory.getBean("userService", "李帅鹏");
//        userService.queryUserInfo();
        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }

    @Test
    public void testProcessBuilder() {
        try {
            // 通过 ProcessBuilder 创建一个新的进程
            ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");
            Process process = processBuilder.start();

            // 等待进程结束
            int exitCode = process.waitFor();
            System.out.println("进程已结束，退出码为：" + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
