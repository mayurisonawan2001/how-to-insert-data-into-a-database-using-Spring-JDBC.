package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springjdbc.dao.StudentDao;

public class App {
    public static void main(String[] args) {
        // Load Spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

        // Get DAO bean
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        // Create Student object
        Student student = new Student(102, "Amit", "Delhi");

        // Insert student
        int result = studentDao.insert(student);

        System.out.println("Record inserted: " + result);
    }
}
