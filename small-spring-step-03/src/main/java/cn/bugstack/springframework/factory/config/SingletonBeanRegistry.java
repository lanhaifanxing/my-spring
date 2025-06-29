package cn.bugstack.springframework.factory.config;

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
