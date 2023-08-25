package Reflection.Lab.HighQualityMistakes_03;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Class reflection = Reflection.class;

        Field[] fields = reflection.getDeclaredFields();

        //• For Fields: "{fieldName} must be private!"
        Arrays.stream(fields).sorted(Comparator.comparing(Field::getName))
                .forEach(field -> {
                    int modifier = field.getModifiers();
                    if (!Modifier.isPrivate(modifier)){
                        System.out.println(field.getName() + " must be private!");
                    }
                });

        Method[] methods = reflection.getDeclaredMethods();

        //For Getters: "{methodName} have to be public!"
        Arrays.stream(methods).filter(method -> method.getName().startsWith("get"))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(method -> {
                    int modifier = method.getModifiers();
                    if (!Modifier.isPublic(modifier)){
                        System.out.println(method.getName() + " have to be public!");
                    }
                });

        //For Setters: "{methodName} have to be private!"
        Arrays.stream(methods).filter(method -> method.getName().startsWith("set"))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(method -> {
                    int modifier = method.getModifiers();
                    if (!Modifier.isPrivate(modifier)){
                        System.out.println(method.getName() + " have to be private!");
                    }
                });

    }
}
