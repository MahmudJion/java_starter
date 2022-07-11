package mvcexample;
public class MVCexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      Student model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console

      StudentController controller = new StudentController();

      controller.updateView();

      //update model data
      controller.setStudentName("John");

      controller.updateView();
   }



}
