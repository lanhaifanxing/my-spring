package cn.bugstack.springframework.factory.support;

import cn.bugstack.springframework.BeansException;
import cn.bugstack.springframework.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
