
public class MultipleAssingments {
	//-----------------------------------------------------
	// Title: MultipleAssingments  class
	// Author: Arda Baran
	// Description: A multiple assingment can be lab works and the contribution of labs can be % 10 and there can be 5 labs 
	//which mean each lab has %2 contribution or different which is determined by user
	//-----------------------------------------------------
	
	
	
	
	double multipleAssingmentWeight;
	String assignmentType;
	GradeNode grade;
public int size,capacity;
public final double overall=100.0;
public MultipleAssingments(String assignmentType,double multipleAssingmentWeight,int capacity) {
	this.multipleAssingmentWeight=multipleAssingmentWeight/overall;
	this.assignmentType=assignmentType;
	this.capacity=capacity;
	this.size=0;
    this.grade=null;
}


public double getMultipleAssingmentWeight() {
	return multipleAssingmentWeight;
}




public void setMultipleAssingmentWeight(double multipleAssingmentWeight) {
	this.multipleAssingmentWeight = multipleAssingmentWeight;
}




public String getAssignmentType() {
	return assignmentType;
}




public void setAssignmentType(String assignmentType) {
	this.assignmentType = assignmentType;
}




public void addGrades(SingleAssingment assingmentGrades) {
if (size < capacity) {
	GradeNode newGrade= new GradeNode(assingmentGrades);
	if(grade==null) {
		grade = newGrade;
	}else {
		GradeNode current = grade;
		while(current.getNext()!=null) {
	    current = current.getNext();
		}
	current.setNext(newGrade);	
	}
	size++;		
}else {
	System.out.println("Assingment  Capacity Reached. Cannot Add More Grades...");
}
}
public double AssingmentsContributionToOverall() {
	double totalAssingmentsContribution=0.0;
    GradeNode curr = grade;
    while(curr!=null) {
    	
    	totalAssingmentsContribution+=curr.grades.contributionToTotalCourse();
    curr=curr.getNext();
    }
return totalAssingmentsContribution;

}

@Override

public String toString() {
 
	String result = "===============================================================\n";
		result+=	"              Assignment Type: " + getAssignmentType()+"    "+
	      "\n";
  result+=          "===============================================================\n";
    GradeNode current = grade;
    while (current != null) {
         result += "Assignment : " + current.grades.getTypeOfAssingment() + "\n";
        result += "Assignment Range: " +  current.grades.getRange() + "                     \n";
        result += "Assignment Grade: " + current.grades.getAssingmentGrade() + "            \n";
        result += "Assignment Weight: %" +  current.grades.getWeightOfTheAssingment()*overall + "       \n";
        result += "Contribution to Total Course Grade: " + String.format("%.2f", current.grades.contributionToTotalCourse()) + " Points.\n";
        result += "---------------------------------------------------------------\n";
        current = current.getNext();
    }
    result += "\n";
    result += "      Total Contribution of " + getAssignmentType() + " To Overall" + ": "
            + String.format("%.2f", AssingmentsContributionToOverall()) + " Points.        \n";
    result+=          "===============================================================\n";
    return result;
}

}
