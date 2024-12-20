package com.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//          Внедрение через конструктор
//        Wheel wheel = new Wheel();
//        Starter starter = new Starter();
//        SparkPlug sparkPlug = new SparkPlug();
//        Engine engine = new Engine(starter, sparkPlug);
//        Accumulator accumulator = new Accumulator();
//        Hinge hinge = new Hinge();
//        Differential differential = new Differential();
//        Suspension suspension = new Suspension(hinge, differential);
//        Car car = new Car(wheel, engine, accumulator, suspension);
//
//        System.out.println(car);
//         2Внедрение зависимостей через XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context.getBean("car", Car.class);
        System.out.println(car);
        //3 Внедрение зависимостей через XML + Java аннотации
//       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Car car = context.getBean(Car.class);
//        System.out.println(car);
    }
}