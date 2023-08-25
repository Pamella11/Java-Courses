package Reflection.Lab.Reflection_01;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class<Reflection> reflectionClass = Reflection.class;
        System.out.println(reflectionClass);

        Class<? super Reflection> reflection = Reflection.class.getSuperclass();
        System.out.println(reflection);

        Class<?>[] interfaces = reflectionClass.getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);

        Reflection newInstance = reflectionClass.getDeclaredConstructor().newInstance();
        System.out.println(newInstance);


    }
}
