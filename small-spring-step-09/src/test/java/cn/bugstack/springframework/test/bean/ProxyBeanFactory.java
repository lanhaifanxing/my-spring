package cn.bugstack.springframework.test.bean;

import cn.bugstack.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class ProxyBeanFactory implements FactoryBean<IUserDao> {

    //相当于给FactoryBean增强了，增强bean返回

    /**
     * 它通过 JDK 动态代理 创建了 IUserDao 接口的代理对象。
     * 代理逻辑定义在 InvocationHandler 中：当调用 IUserDao 的 queryUserName 方法时，会从 HashMap 中根据用户 ID 查找用户名，并返回 “你被代理了 + 结果” 的字符串。
     * 最终返回的是 IUserDao 类型的代理实例（不是 ProxyBeanFactory 自身）。
     */
    @Override
    public IUserDao getObject() throws Exception {
        InvocationHandler handler = (proxy, method, args) -> {

            Map<String, String> hashMap = new HashMap<>();
            hashMap.put("10001", "小傅哥");
            hashMap.put("10002", "八杯水");
            hashMap.put("10003", "阿毛");

            return "你被代理了 " + method.getName() + "：" + hashMap.get(args[0].toString());
        };
        return (IUserDao) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{IUserDao.class}, handler);
    }

    @Override
    public Class<?> getObjectType() {
        return IUserDao.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
