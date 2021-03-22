import java.io.*;
import java.util.*;
public class MainClass{
//Declaring data that is required later in the program
static Scanner scan=new Scanner(System.in);
//Array of subject names
static String subjects[]={"OOP1","Operating System","Networking","OOP2","INternet Technology","Java Servelets","Database Administration"};
//Array of subject codes
static String codes[]={"CMT001","CMT002","CMT007","CMT003","CMT004","CMT005","CMT006"};

//The main function
public static void main(String [] args){
//Implementing the subjects
Subject sbj=new Subject();
//System.out.println("Enter the code of the course");
//sbj.setCode(scan.next());
// System.out.println("Enter the Name of the course");
//sbj.setName(scan.next());
int cat1=sbj.getCat1();
int cat2=sbj.getCat1();
int exam=sbj.getExam();
int tcats=cat1 + cat2;
int total=tcats+exam;
//System.out.println(sbj.getCode()+"\t"+sbj.getName() +cat1+"\t"+cat2+"\t"+tcats+"\t"+exam+"\t"+total+"\t"+sbj.grading(total));
//Implementing the Class Students.
// Every Student takes up 7 subjects. Take note of the loop
//Implementing the Class Students.
// Every Student takes up 7 subjects. Take note of the loop
Student st=new Student();
System.out.println("Enter the number of the Student");
st.setNumber(scan.nextInt());
System.out.println("Enter the Name of the Student");
st.setStName(scan.next());
//System.out.println(sbj.getCode()+"\t"+sbj.getName() + cat1+"\t"+cat2+"\t"+tcats+"\t"+exam+"\t"+total+"\t"+sbj.grading(total));
System.out.println("St Number:\t" +st.getNumber()+"\t\t"+"St Name:\t" + st.getStName());
for (int i=0;i<7;i++){
int x=(int)Math.ceil(Math.random()*6);
st=new Student();
st.setCode(codes[x]);
st.setName(subjects[x]);
cat1=st.getCat1();
cat2=st.getCat2();
exam=st.getExam();
tcats=cat1 + cat2;
total=tcats+exam;
System.out.println(st.getCode()+"\t"+st.getName() +cat1+"\t"+cat2+"\t"+tcats+"\t"+exam+"\t"+total+"\t"+st.grading(total));
}
}//End of main
}//End of Class StudentTest
