import java.util.ArrayList;
import java.util.List;

public class Courses {

	//-----------------------------------------------------
	// Title: Courses class
	// Author: Arda Baran
	// Description: A course may have only single assingments , multiple assingments or both.
	//-----------------------------------------------------
	
	
	String courseName;
public List<SingleAssingment> singleAssignments;
public List<MultipleAssingments> multipleAssignments;
public int numberOfSingleAssingments,numberOfMultipleAssingments;  
public String[][] gradeDistribution;
public Courses(String courseName, int numberOfSingleAssingments, int numberOfMultipleAssingments,String[][] gradeDistribution) {
    this.courseName = courseName;
    this.numberOfSingleAssingments = numberOfSingleAssingments;
    this.numberOfMultipleAssingments = numberOfMultipleAssingments;
    this.singleAssignments = new ArrayList<>();
    this.multipleAssignments = new ArrayList<>();
    this.gradeDistribution=gradeDistribution;
    printCourse();
}
public Courses(String courseName ,int numberOfSingleAssingments, int numberOfMultipleAssingments) {
	 this.courseName = courseName;
	    this.numberOfSingleAssingments = numberOfSingleAssingments;
	    this.numberOfMultipleAssingments = numberOfMultipleAssingments;
	    this.singleAssignments = new ArrayList<>();
	    this.multipleAssignments = new ArrayList<>();	
	
	
}
public void setNumberOfSingleAssingments(int numberOfSingleAssingments) {
    this.numberOfSingleAssingments = numberOfSingleAssingments;
}
public String getCourseName() {
	return  courseName;
}


public void setNumberOfMultipleAssingments(int numberOfMultipleAssingments) {
    this.numberOfMultipleAssingments = numberOfMultipleAssingments;
}
public String[][] getGradeDistribution() {
    return gradeDistribution;
}

public void setGradeDistribution(String[][] gradeDistribution) {
    this.gradeDistribution = gradeDistribution;
}
public void addSingleAssignment(SingleAssingment assignment) {
    if (singleAssignments.size() < numberOfSingleAssingments) {
        singleAssignments.add(assignment);
    } else {
        System.out.println("Cannot add more single assignments. Capacity reached.");
    }
}

public void addMultipleAssignments(MultipleAssingments assignments) {
    if (multipleAssignments.size() < numberOfMultipleAssingments) {
        multipleAssignments.add(assignments);
    } else {
        System.out.println("Cannot add more multiple assignments. Capacity reached.");
    }
}
public double calculateOverallGrade() {
    double overallGrade = 0.0;

    // Calculate overall grade from single assignments
    for (SingleAssingment assignment : singleAssignments) {
        if (assignment != null) {
            overallGrade += assignment.contributionToTotalCourse();
        }
    }

    // Calculate overall grade from multiple assignments
    for (MultipleAssingments assignments : multipleAssignments) {
        if (assignments != null) {
            overallGrade += assignments.AssingmentsContributionToOverall() ;
        }
    }

    return overallGrade;
}

public void displayContributions() {
  
// Display the contribution for each single assignment
    for (SingleAssingment assignment : singleAssignments) {
        System.out.println(assignment.toString());
    }

    // Display the contribution for each multiple assignment
    for (MultipleAssingments assignments : multipleAssignments) {
        System.out.println(assignments.toString());
    }
}
public void displayMinRequiredGradeToPass(double l,double w,double r) {
	System.out.println();
	System.out.println("Minimum Required Grade To Pass This Course From Final Exam : " + String.format("%.2f", minRequiredGradeFromFinalToPassTheCourse(l,w,r)) + "");
	
}

public void displayOverall() {
	System.out.println("Overall Course Grade: " + String.format("%.2f", calculateOverallGrade()) + "");
System.out.println("");
}

public double minRequiredGradeFromFinalToPassTheCourse(double passLimit,double weightOfAssingment,double rangeOfGrade) {
	return (((passLimit - calculateOverallGrade()) / (weightOfAssingment ))*rangeOfGrade );
}

public void printCourse() {
	   System.out.println("Course Name: " + courseName);
	   System.out.println();
	   System.out.println();   
	
	
	
	System.out.printf("%-30s%-5s\n", "COURSE ASSIGNMENTS", "WEIGHT");
	System.out.println("");

	    // Iterate over each row (assignment type and percentage)
	    for (String[] category : getGradeDistribution()) {
	        // Ensure that the row has at least two elements
	        if (category.length >= 2) {
	        	System.out.printf("%-30s%-5s\n", category[0], category[1]);
	        } else {
	            System.out.println("Invalid grade distribution entry: " + String.join(", ", category));
	        }
	    }
	    System.out.println();
	}

}




