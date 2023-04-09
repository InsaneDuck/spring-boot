package dev.insaneduck.springboot;

import java.lang.reflect.Field;

public class Logic
{
    public static Object updateObjectWithNonNullFields(Object existingObject, Object updatedObject)
    {
        try
        {
            Class<?> clazz = existingObject.getClass();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                Object newValue = field.get(updatedObject);
                if (newValue != null) {
                    field.set(existingObject, newValue);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return existingObject;
    }
}
