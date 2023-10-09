package exam03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.Month;

public class Ex02 {
    public static void main(String[] args) {
        Class cls = Book.class;

        System.out.println("-----Fields-----");
        Field[] fields = cls.getFields();
        for(Field field : fields){
            System.out.println(field);
        }

        System.out.println("-----Method-----");
        Method[] methods = cls.getMethods();
        for(Method method : methods){
            System.out.println(method);
        }

        System.out.println("-----Constructors-----");
        Constructor[] constructors = cls.getConstructors();
        for(Constructor constructor : constructors){
            System.out.println(constructor);
        }
    }
}
