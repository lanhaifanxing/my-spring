package cn.bugstack.springframework.factory;

import cn.bugstack.springframework.BeansException;
import cn.bugstack.springframework.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
