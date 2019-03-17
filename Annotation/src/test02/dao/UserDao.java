package test02.dao;

import test02.MyJUnitTest;

public class UserDao {
    static {
        System.out.println("来自静态代码段的消息: 已将UserDao.class文件从硬盘加载到内存！");
    }

    @MyJUnitTest
    public void addUser() {
        System.out.println("增加用户");
    }

    @MyJUnitTest
    public void delUser() {
        System.out.println("删除用户");
    }

    @MyJUnitTest
    public void uptUser() {
        System.out.println("更新用户");
    }

    public void getUser() {
        System.out.println("获取用户");
    }
}
