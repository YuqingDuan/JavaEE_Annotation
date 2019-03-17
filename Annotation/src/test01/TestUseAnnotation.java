package test01;

/**
 * 测试使用自定义注解
 */
public class TestUseAnnotation {
    @MyAnno01(timeout = 100, clazz = java.util.Date.class, strs = {"aaa", "bbb"})
    public void test01() {

    }
}
