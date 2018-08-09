package com.l.javaannotation.practise;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
	int value();
}

//Applying annotation
class Hello{
	@MyAnnotation(value=10)
	public void sayHello()
	{
		System.out.println("Hello Annotation");
	}
}

//Accessing annotation

public class AnnotationCustomDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Hello h=new Hello();
		Method m=h.getClass().getMethod("sayHello");
		MyAnnotation a=m.getAnnotation(MyAnnotation.class);
		System.out.println("Value is:"+a.value());

	}

}
