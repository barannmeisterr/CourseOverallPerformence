
public class SingleAssingment {
	//-----------------------------------------------------
	// Title: Single Assingment Class . Single Assingment can be a final exam , a term project , a term homework etc...
	// Author: Arda Baran
	// Description: In order to contribution of an assingment to overall grade of a course , we need the weight of assingment ,
	//the range of assingment such as a work graded out of 100 or 10 or 40 and a grade out of range. 
	//-----------------------------------------------------
	
	
	
	
	double range,assingmentGrade,weightOfTheAssingment;
public final double overall=100.0;
String typeOfAssingment;
public SingleAssingment(String typeOfAssingment,double range,double assingmentGrade,double weightOfTheAssingment) {
	this.typeOfAssingment=typeOfAssingment;
	this.range=range;
	this.assingmentGrade=assingmentGrade;
    this.weightOfTheAssingment=weightOfTheAssingment/overall;
    
}

public String getTypeOfAssingment() {
	return typeOfAssingment;
}

public void setTypeOfAssingment(String typeOfAssingment) {
	this.typeOfAssingment = typeOfAssingment;
}

public double getRange() {
	return range;
}

public void setRange(double range) {
	this.range = range;
}

public double getAssingmentGrade() {
	return assingmentGrade;
}

public void setAssingmentGrade(double assingmentGrade) {
	this.assingmentGrade = assingmentGrade;
}

public double getWeightOfTheAssingment() {
	return weightOfTheAssingment;
}

public void setWeightOfTheAssingment(double weightOfTheAssingment) {
	this.weightOfTheAssingment = weightOfTheAssingment;
}
public double contributionToTotalCourse() {
	return (getAssingmentGrade() / getRange()) * getWeightOfTheAssingment() * overall;
}
@Override
public String toString() {
    return " ==============================================================\n" +
           "                Assignment Type: " + getTypeOfAssingment()+"   " 
    		+  "\n" +
           " ==============================================================\n" +
           "Assignment Range: " + getRange() + "\n" +
           "Assignment Grade: " + getAssingmentGrade() + "\n" +
           "Assignment Weight: %" + getWeightOfTheAssingment()*overall + "\n" +
           "Contribution to Course Overall: " + String.format("%.2f", contributionToTotalCourse()) + " Points.\n" +
           "===============================================================\n";
}
}



