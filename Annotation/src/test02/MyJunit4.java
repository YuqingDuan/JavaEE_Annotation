package test02;

import test02.dao.UserDao;

import java.lang.reflect.Method;

public class MyJunit4 {
    public static void main(String[] args) throws Exception {
        // 加载UserDao.class字节码文件中的方法, 判断哪些方法上有自定义的注解@MyJUnitTest
        // 如果当前的方法有@MyJUnitTest,执行
        // 否则不执行

        // 1_将UserDao.class字节码文件加载到内存中, clazz对象(代表字节码文件在内存中的对象)
        Class clazz = Class.forName("test02.dao.UserDao");
        // 2_获取字节码对象上所有的方法, 返回Method数组对象, 数组中的每一个元素都代表Method对象(相当于字节码上的每一个方法)
        Method[] methods = clazz.getMethods();
        // 3_遍历字节码对象上所有的方法
        for (Method method : methods) {
            // 判断当前方法上是否有@MyJUnitTest
            if (method.isAnnotationPresent(MyJUnitTest.class)) {
                // 如果当前的方法上有@MyJUnitTest,执行
                // 否则忽略
                method.invoke(new UserDao());
            }
        }
    }
}
