package model;

public class Doctor {
 private String name;
 private String docId;
 


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDocId() {
	return docId;
}
public void setDocId(String docId) {
	this.docId = docId;
}

public Doctor(String name, String docId) {
	
	this.name = name;
	this.docId = docId;
}
 

 

	
}
