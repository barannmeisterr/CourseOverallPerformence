
import java.util.Arrays;
import java.util.*;
public class Main {
	public static	String[][] cpme472GradeDistribution = {
	        {"Midterm", "%25"},
	        {"Final", "%35"},
	        {"Quizzes", "%15"},
	        {"Laboratory Works", "%15"},
	        {"Homeworks", "%10"}
	};
public static String[][] cpme223GradeDistribution = {
	        {"Midterm", "%25"},
	        {"Final", "%35"},
	        {"Quizzes", "%25"},
	        {"Homeworks", "%15"}
	};
public static String[][] cpme421GradeDistribution = {
	        {"Midterm", "%30"},
	        {"Final", "%30  "},
	        {"Quizzes", "%10"},
	        {"Seminar", "%10"},
	        {"Project", "%20"}
	};
public static String[][] cpme371GradeDistribution = {
        {"Midterm", "%25"},
        {"Final", "%30"},
        {"Quizzes", "%15"},		        
        {"Homeworks", "%30"}
};
public static String[][] ee207GradeDistribution = {
        {"Midterm", "%30"},
        {"Final", "%35"},
        {"Quiz", "%10"},
        {"Laboratory Works", "%25"}
        
};
public static	String[][] lit100GradeDistribution = {
        {"Midterm", "%20"},
        {"Final", "%30"},
        {"Quizzes", "%20"},
        {"Attendence","%10"},
        {"Homework", "%20"}
};
public static void displayOverallGrades(List<Courses> courses) {
    System.out.println("======================");
    System.out.printf("%-10s | %-8s |\n", "COURSE", "OVERALL");
    System.out.println("======================");

    for (Courses course : courses) {
        double overallGrade = course.calculateOverallGrade();
        System.out.printf("%-10s | %-8.2f |\n", course.getCourseName(), overallGrade);
        System.out.println("----------------------");
    }

    
}
       public static void main(String[] args) {
		// TODO Auto-generated method stub
            
    	   Scanner sc = new Scanner(System.in);
	       int choice;
    	   System.out.println(" ==========================================================");
    	   System.out.println("|*Please Enter A Number to See Overall Performence*       |");
    	   System.out.println("|        0.Overall Performences of Courses                |");
    	   System.out.println("|                   1.CPME 223                            |");
    	   System.out.println("|                   2.CPME 472                            |");
    	   System.out.println("|                   3.EE   207                            |");
    	   System.out.println("|                   4.CPME 421                            |");
    	   System.out.println("|                   5.CPME 371                            |");
    	   System.out.println("|                   6.LIT  100                            |");    	   
    	   System.out.println(" ==========================================================");
    	   System.out.println("");
    	   System.out.print("Choice: ");
    	   choice=sc.nextInt();
    	   sc.close();
    	   switch(choice) {
           
    	   case 0 :
    		   Courses c23 = new Courses("CPME 223" ,2,2);
    		   Courses c72 = new Courses("CPME 472" ,2,3);
    		   Courses e07 = new Courses("EE 207" ,3,1);
    		   Courses c21 = new Courses("CPME 421" ,4,1);
    		   Courses c71 = new Courses("CPME 371" ,2,2);
    		   Courses l00 = new Courses("LIT 100" ,4,1);
	
    		   MultipleAssingments q23 = new  MultipleAssingments("Quiz", 25, 3);
    		   q23.addGrades(new SingleAssingment("Quiz 1", 100, 25, 8.33));
    		   q23.addGrades(new SingleAssingment("Quiz 1", 100, 80, 8.33));
    		   q23.addGrades(new SingleAssingment("Quiz 1", 100, 60, 8.33));
    		   MultipleAssingments hw23 = new MultipleAssingments("Homework", 15, 2);
    		   hw23.addGrades(new SingleAssingment("Homework 1", 100, 95, 7.50));
    		    hw23.addGrades(new SingleAssingment("Homework 2", 100, 90, 7.50));
    		    c23.addMultipleAssignments(q23);
    		    c23.addMultipleAssignments(hw23);
    		    c23.addSingleAssignment(new SingleAssingment("Midterm Exam", 100, 27, 25));
    		    
    		    c23.addSingleAssignment(new SingleAssingment("Final Exam", 100, 65, 35));
    		    
    		 
 	
     		   MultipleAssingments q72 = new  MultipleAssingments("Quiz", 15, 4);
     		   q72.addGrades(new SingleAssingment("Quiz 1", 100, 33.33, 3.75));
     		   q72.addGrades(new SingleAssingment("Quiz 2", 10, 4.78, 3.75));
     		   q72.addGrades(new SingleAssingment("Quiz 3", 10, 4.46, 3.75));
     		  q72.addGrades(new SingleAssingment("Quiz 4", 10, 3.63, 3.75));
     		   
     		   MultipleAssingments hw72 = new MultipleAssingments("Homework", 10, 2);
     		   hw72.addGrades(new SingleAssingment("Homework 1", 5, 1.50, 5));
     		    hw72.addGrades(new SingleAssingment("Homework 2", 5, 2.00, 5));
     		   MultipleAssingments l72 = new MultipleAssingments("Lab", 15, 5);
     		  l72.addGrades(new SingleAssingment("Lab 1", 3, 0.90, 3 ));
     		    l72.addGrades(new SingleAssingment("Lab 2", 3, 2.20, 3 ));
     		    l72.addGrades(new SingleAssingment("Lab 3", 3, 1.30, 3 ));
     		    l72.addGrades(new SingleAssingment("Lab 4", 3, 1.80, 3 ));
     		    l72.addGrades(new SingleAssingment("Lab 5", 3, 2.90, 3 ));
     		    
     		    
     		    c72.addMultipleAssignments(q72);
     		    c72.addMultipleAssignments(hw72);
     		   c72.addMultipleAssignments(l72);
     		    
     		    c72.addSingleAssignment(new SingleAssingment("Midterm Exam", 100, 63, 25));
     		    
     		    c72.addSingleAssignment(new SingleAssingment("Midterm Exam", 100, 86, 35));
    		    
    		    
     		   MultipleAssingments labeee = new MultipleAssingments("Laboratory Works", 25, 8);
     		    
     		    labeee.addGrades(new SingleAssingment("PreLab 1 Report",     100, 100, 3.125));
     		    labeee.addGrades(new SingleAssingment("Experiment 1 Report", 100, 50, 3.125 ));
     		    labeee.addGrades(new SingleAssingment("PreLab 2 Report",    100, 100, 3.125 ));
     		    labeee.addGrades(new SingleAssingment("Experiment 2 Report", 100, 82, 3.125 ));
     		    labeee.addGrades(new SingleAssingment("PreLab 3 Report",    100, 100, 3.125 ));
     		    labeee.addGrades(new SingleAssingment("Experiment 3 Report", 100, 95, 3.125 ));
     		    labeee.addGrades(new SingleAssingment("PreLab 4 Report",     100, 85, 3.125 ));
     		    labeee.addGrades(new SingleAssingment("Experiment 4 Report", 100, 95, 3.125 ));
     			
     			e07.addMultipleAssignments(labeee);
     			
     			e07.addSingleAssignment(new SingleAssingment("Midterm Exam", 100, 41, 30));
     		    e07.addSingleAssignment(new SingleAssingment("Final Exam", 100, 33, 35));
     		    e07.addSingleAssignment(new SingleAssingment("Quiz", 100, 44, 10));
     		   MultipleAssingments q21 = new MultipleAssingments("Quizzes", 10, 2);
     		   q21.addGrades(new SingleAssingment("Quiz 1", 10, 2, 5));
     		    q21.addGrades(new SingleAssingment("Quiz 2", 10, 2, 5));
     		    c21.addMultipleAssignments(q21);
     			
     			
     			
     			c21.addSingleAssignment(new SingleAssingment("Seminar", 10, 10,10));
     		    c21.addSingleAssignment(new SingleAssingment("Project", 100, 70, 20));
     		    c21.addSingleAssignment(new SingleAssingment("Midterm Exam", 40, 9, 30));
     		    c21.addSingleAssignment(new SingleAssingment("Final Exam", 40, 21, 30));
     			
    		    
     		   MultipleAssingments q71 = new MultipleAssingments("Quizzes", 15, 3);
     		    
     		    q71.addGrades(new SingleAssingment("Quiz 1", 100, 0, 5));
     		    q71.addGrades(new SingleAssingment("Quiz 2", 100, 0, 5));
     		    q71.addGrades(new SingleAssingment("Quiz 3", 100, 98, 5));

     		    MultipleAssingments hw71 = new MultipleAssingments("Homeworks", 30, 2);
     		    
     		    hw71.addGrades(new SingleAssingment("Homework 1", 100, 67, 15));
     		    hw71.addGrades(new SingleAssingment("Homework 2", 100, 83, 15));

     		    c71.addMultipleAssignments(q71);
     		    c71.addMultipleAssignments(hw71);

     		    c71.addSingleAssignment(new SingleAssingment("Midterm Exam", 100, 5, 25));
     		    c71.addSingleAssignment(new SingleAssingment("Final Exam", 100, 2, 30));

    		    
     		   MultipleAssingments ql = new MultipleAssingments("Quizzes", 20, 4);
     		    
     		    ql.addGrades(new SingleAssingment("Quiz 1", 5, 3.50, 5));
     		    ql.addGrades(new SingleAssingment("Quiz 2", 5, 4.50, 5));
     		    ql.addGrades(new SingleAssingment("Quiz 3", 5, 5.00, 5));
     		    ql.addGrades(new SingleAssingment("Quiz 4", 5, 4.00, 5));
     			
     		    l00.addMultipleAssignments(ql);
     		   
     		    l00.addSingleAssignment(new SingleAssingment("Midterm Exam", 20, 15, 20));
     		    l00.addSingleAssignment(new SingleAssingment("Final Exam", 30, 20, 30));
     		    l00.addSingleAssignment(new SingleAssingment("Homework", 20, 20,20));
     		    l00.addSingleAssignment(new SingleAssingment("Attendance", 10, 4.12, 10));
     			
     		   List<Courses> courses = Arrays.asList(c23, c72, e07, c21, c71, l00);
     	        displayOverallGrades(courses);
     		    
     		    
     		    
     		    
     		    
    		    
    		    
    		   break;
    		   
    	   case 1:
		Courses cpme223 = new Courses("CPME 223" ,2,2,cpme223GradeDistribution);
		MultipleAssingments quizCpme223 = new MultipleAssingments("Quiz", 25, 3);
	    
	    quizCpme223.addGrades(new SingleAssingment("Quiz 1", 100, 25, 8.33));
	    quizCpme223.addGrades(new SingleAssingment("Quiz 2", 100, 80, 8.33));
	    quizCpme223.addGrades(new SingleAssingment("Quiz 3", 100, 60, 8.33));

	    MultipleAssingments hwCpme223 = new MultipleAssingments("Homework", 15, 2);
	    
	    hwCpme223.addGrades(new SingleAssingment("Homework 1", 100, 95, 7.50));
	    hwCpme223.addGrades(new SingleAssingment("Homework 2", 100, 90, 7.50));

	    cpme223.addMultipleAssignments(quizCpme223);
	    cpme223.addMultipleAssignments(hwCpme223);

	    cpme223.addSingleAssignment(new SingleAssingment("Midterm Exam", 100, 27, 25));
	    
	    cpme223.addSingleAssignment(new SingleAssingment("Final Exam", 100, 65, 35));

	    
	    cpme223.displayContributions();

	    
	 
	cpme223.displayOverall();
	
	break;
    	   case 2 :
		Courses cpme472 = new Courses("CPME 472" ,2,3,cpme472GradeDistribution);
		
MultipleAssingments quizCpme472 = new MultipleAssingments("Quizzes", 15, 4);
	    
	    quizCpme472.addGrades(new SingleAssingment("Quiz 1", 100, 33.33, 3.75));
	    quizCpme472.addGrades(new SingleAssingment("Quiz 2", 10, 4.78, 3.75));
	    quizCpme472.addGrades(new SingleAssingment("Quiz 3", 10, 4.46, 3.75));
	    quizCpme472.addGrades(new SingleAssingment("Quiz 4", 10, 3.63, 3.75));
	    MultipleAssingments hwCpme472 = new MultipleAssingments("Homeworks", 10, 2);
	    
	    hwCpme472.addGrades(new SingleAssingment("Homework 1", 5, 1.50, 5));
	    hwCpme472.addGrades(new SingleAssingment("Homework 2", 5, 2, 5));
MultipleAssingments labCpme472 = new MultipleAssingments("Laboratory Works", 15, 5);
	    
	    labCpme472.addGrades(new SingleAssingment("Lab 1", 3, 0.90, 3 ));
	    labCpme472.addGrades(new SingleAssingment("Lab 2", 3, 2.20, 3 ));
	    labCpme472.addGrades(new SingleAssingment("Lab 3", 3, 1.30, 3 ));
	    labCpme472.addGrades(new SingleAssingment("Lab 4", 3, 1.80, 3 ));
	    labCpme472.addGrades(new SingleAssingment("Lab 5", 3, 2.90, 3 ));
	    
	    
	    cpme472.addMultipleAssignments(quizCpme472);
	    cpme472.addMultipleAssignments(labCpme472);	    
	    cpme472.addMultipleAssignments(hwCpme472);
	    cpme472.addSingleAssignment(new SingleAssingment("Midterm Exam", 100, 63, 25));
	    
	    cpme472.addSingleAssignment(new SingleAssingment("Final Exam", 100, 86, 35));
		
	    
	    cpme472.displayContributions();

	    
	 
	cpme472.displayOverall();
	
		break;
    	   case 3:
		
		Courses ee207 = new Courses("EE 207" ,3,1,ee207GradeDistribution);
		
MultipleAssingments labee = new MultipleAssingments("Laboratory Works", 25, 8);
	    
	    labee.addGrades(new SingleAssingment("PreLab 1 Report",     100, 100, 3.125));
	    labee.addGrades(new SingleAssingment("Experiment 1 Report", 100, 50, 3.125 ));
	    labee.addGrades(new SingleAssingment("PreLab 2 Report",    100, 100, 3.125 ));
	    labee.addGrades(new SingleAssingment("Experiment 2 Report", 100, 82, 3.125 ));
	    labee.addGrades(new SingleAssingment("PreLab 3 Report",    100, 100, 3.125 ));
	    labee.addGrades(new SingleAssingment("Experiment 3 Report", 100, 95, 3.125 ));
	    labee.addGrades(new SingleAssingment("PreLab 4 Report",     100, 85, 3.125 ));
	    labee.addGrades(new SingleAssingment("Experiment 4 Report", 100, 95, 3.125 ));
		
		ee207.addMultipleAssignments(labee);
		
		ee207.addSingleAssignment(new SingleAssingment("Midterm Exam", 100, 41, 30));
	    ee207.addSingleAssignment(new SingleAssingment("Final Exam", 100, 33, 35));
	    ee207.addSingleAssignment(new SingleAssingment("Quiz", 100, 44, 10));
	    
	    
	    ee207.displayContributions();

	    
	 
	ee207.displayOverall();
	    
		break;
		
    	   case 4:
		Courses cpme421 = new Courses("CPME 421" ,4,1,cpme421GradeDistribution);
		
MultipleAssingments qCpme421 = new MultipleAssingments("Quizzes", 10, 2);
	    
	    qCpme421.addGrades(new SingleAssingment("Quiz 1", 10, 2, 5));
	    qCpme421.addGrades(new SingleAssingment("Quiz 2", 10, 2, 5));
	    cpme421.addMultipleAssignments(qCpme421);
		
		
		
		cpme421.addSingleAssignment(new SingleAssingment("Seminar", 10, 10,10));
	    cpme421.addSingleAssignment(new SingleAssingment("Project", 100, 70, 20));
	    cpme421.addSingleAssignment(new SingleAssingment("Midterm Exam", 40, 9, 30));
	    cpme421.addSingleAssignment(new SingleAssingment("Final Exam", 40, 21, 30));
		
	    
	    
	    cpme421.displayContributions();

	    
	 
	cpme421.displayOverall();
	    
	    
	    
	    break;
		
    	   case 5:
		
		Courses cpme371 = new Courses("CPME 371" ,2,2,cpme371GradeDistribution);
		
MultipleAssingments quizCpme371 = new MultipleAssingments("Quizzes", 15, 3);
	    
	    quizCpme371.addGrades(new SingleAssingment("Quiz 1", 100, 0, 5));
	    quizCpme371.addGrades(new SingleAssingment("Quiz 2", 100, 0, 5));
	    quizCpme371.addGrades(new SingleAssingment("Quiz 3", 100, 98, 5));

	    MultipleAssingments hwCpme371 = new MultipleAssingments("Homeworks", 30, 2);
	    
	    hwCpme371.addGrades(new SingleAssingment("Homework 1", 100, 67, 15));
	    hwCpme371.addGrades(new SingleAssingment("Homework 2", 100, 83, 15));

	    cpme371.addMultipleAssignments(quizCpme371);
	    cpme371.addMultipleAssignments(hwCpme371);

	    cpme371.addSingleAssignment(new SingleAssingment("Midterm Exam", 100, 5, 25));
	    cpme371.addSingleAssignment(new SingleAssingment("Final Exam", 100, 2, 30));

	    
	    cpme371.displayContributions();

	   
	 
	cpme371.displayOverall();
	    
	    
		break;
		
    	   case 6 :
		Courses lit100 = new Courses("LIT 100" ,4,1,lit100GradeDistribution);
		
MultipleAssingments quizl = new MultipleAssingments("Quizzes", 20, 4);
	    
	    quizl.addGrades(new SingleAssingment("Quiz 1", 5, 3.50, 5));
	    quizl.addGrades(new SingleAssingment("Quiz 2", 5, 4.50, 5));
	    quizl.addGrades(new SingleAssingment("Quiz 3", 5, 5.00, 5));
	    quizl.addGrades(new SingleAssingment("Quiz 4", 5, 4.00, 5));
		
	    lit100.addMultipleAssignments(quizl);
	   
	    lit100.addSingleAssignment(new SingleAssingment("Midterm Exam", 20, 15, 20));
	    lit100.addSingleAssignment(new SingleAssingment("Final Exam", 30, 20, 30));
	    lit100.addSingleAssignment(new SingleAssingment("Homework", 20, 20,20));
	    lit100.addSingleAssignment(new SingleAssingment("Attendance", 10, 4.12, 10));
		
	    
	    lit100.displayContributions();

	    
	 
	lit100.displayOverall();
	    
	    break;

    	   default:
    			System.out.println("Wrong Number! Try Again...");
	    
	    
    	   }
	}
}






