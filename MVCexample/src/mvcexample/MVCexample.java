/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcexample;

/**
 *
 * @author gd17aaq
 */
public class MVCexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      //Student model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
     

      StudentController controller = new StudentController();

      controller.updateView();

      //update model data
      controller.setStudentName("John");

      controller.updateView();
   }

   
    
}
