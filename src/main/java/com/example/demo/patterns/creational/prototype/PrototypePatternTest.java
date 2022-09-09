package com.example.demo.patterns.creational.prototype;

import java.util.List;
//The prototype pattern is used when the Object creation is a costly affair and
// requires a lot of time and resources and you have a similar object already existing.
// So this pattern provides a mechanism to copy the original object to a new object and then
// modify it according to our needs. This pattern uses java cloning to copy the object.
// Prototype design pattern mandates that the Object which you are copying should provide the
// copying feature. It should not be done by any other class.
// However whether to use the shallow or deep copy of the Object properties depends on the
// requirements and it’s a design decision. Check out Prototype Pattern for sample program.

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Pankaj");

        System.out.println("emps List: "+emps.getEmpList());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);
    }
}
