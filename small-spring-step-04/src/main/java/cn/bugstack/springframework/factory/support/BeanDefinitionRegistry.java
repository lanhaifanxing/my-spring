package cn.bugstack.springframework.factory.support;

import cn.bugstack.springframework.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
