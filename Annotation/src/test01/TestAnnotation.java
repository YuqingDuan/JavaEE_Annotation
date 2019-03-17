package test01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unused", "rawtypes"})
public class TestAnnotation {
    // 以下注解的含义是:声明当前的方法是重写父类的方法
    @Override
    public String toString() {
        return super.toString();
    }

    public void test01() {
        // 以下注解的含义是:抑制编译器发生警告信息
        // @SuppressWarnings("unused")
        int i;
        // 以下注解的含义是:抑制编译器发生警告信息(如果有变量未使用,未遵循泛型格式错误不报警告)
        // @SuppressWarnings({"unused", "rawtypes"})
        List list = new ArrayList();
    }

    // 以下注解的含义是:声明以下的方法是过时的方法,不建议大家使用
    @Deprecated
    public void test02() {

    }

    @Test(timeout = 1000)
    public void test03() {
        try {
            Thread.sleep(1100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test03");
    }
}
