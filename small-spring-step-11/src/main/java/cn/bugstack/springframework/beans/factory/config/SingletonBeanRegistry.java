package cn.bugstack.springframework.beans.factory.config;

import cn.bugstack.springframework.context.event.ApplicationEventMulticaster;

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);

    /**
     * 销毁单例对象
     */
    void destroySingletons();

    void registerSingleton(String beanName, Object singletonObject);
}
