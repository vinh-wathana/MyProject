package org.aupp.app;

import org.aupp.model.Employee; 

public class App { 
 
 public static void main(String[] args) { 
  Employee emp = new Employee(1,"Peter Parker"); 
  System.out.println(emp.getId() + " --- " + emp.getName()); 
 
 } 
 
}