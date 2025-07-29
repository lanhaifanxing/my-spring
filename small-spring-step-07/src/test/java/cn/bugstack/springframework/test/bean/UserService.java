package cn.bugstack.springframework.test.bean;

import cn.bugstack.springframework.beans.factory.DisposableBean;
import cn.bugstack.springframework.beans.factory.InitializingBean;

public class UserService implements InitializingBean, DisposableBean {

    private String uId;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String company;
    private String location;

    private UserDao userDao;

    public String queryUserInfo() {
        System.out.println("查询用户信息：" + userDao.queryUserName(uId));
        return userDao.queryUserName(uId);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("执行：UserService.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行：UserService.afterPropertiesSet");
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}