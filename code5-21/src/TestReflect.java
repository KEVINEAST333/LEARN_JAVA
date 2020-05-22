import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //先获取到类对象
        Class catClass = Class.forName("Cat");
        //2. 借助类对象, 获取到指定的 Field 对象
        // 现在这一步获取到的 field 对象相当于从一个大图纸中获取了一个局部的图纸.
        Field field = catClass.getDeclaredField("name");
        //破坏private
        field.setAccessible(true);
        Cat cat = new Cat();
        field.set(cat,"咪咪");
        System.out.println(cat.toString());
        //反射方法
        Method method = catClass.getDeclaredMethod("eat",String.class);
        method.setAccessible(true);
        method.invoke(cat,"鱼");
    }
}
