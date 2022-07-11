package mvcexample;

/**
 *
 * @author gd17aaq
 */
public class StudentController {
   private Student model;
   private StudentView view;

   private Student retriveStudentFromDatabase(){
      model = new Student();
      model.setName("Robert");
      model.setRollNo("10");
      return model;
   }

   public StudentController(){
      this.retriveStudentFromDatabase();
      this.view = new StudentView();

   }

   public void setStudentName(String name){
      model.setName(name);
   }

   public String getStudentName(){
      return model.getName();
   }

   public void setStudentRollNo(String rollNo){
      model.setRollNo(rollNo);
   }

   public String getStudentRollNo(){
      return model.getRollNo();
   }

   public void updateView(){
      view.printStudentDetails(model.getName(), model.getRollNo());
   }

}
