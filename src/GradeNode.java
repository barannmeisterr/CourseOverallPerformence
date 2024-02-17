
public class GradeNode {
	//-----------------------------------------------------
	// Title: GradeNode class
	// Author: Arda Baran
	// Description: Since multiple Assingments consists of single assingments more than one , I will use Single Assingment class
	// as node in multiple assingment class.
	//-----------------------------------------------------
	
	public SingleAssingment grades;
GradeNode next;
public GradeNode(SingleAssingment grades) {
	this.grades=grades;
    this.next=null;
}
public SingleAssingment getGrades() {
	return grades;
}
public void setGrades(SingleAssingment grades) {
	this.grades = grades;
}
public GradeNode getNext() {
	return next;
}
public void setNext(GradeNode next) {
	this.next = next;
}

}
