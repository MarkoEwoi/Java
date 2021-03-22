import java.io.*;
import java.util.*;
class Marks{
int cat1, cat2;
int exam;
Marks(){
cat1=(int)Math.ceil(Math.random()*20);
cat2=(int)Math.ceil(Math.random()*10);
exam=(int)Math.ceil(Math.random()*70);
}//End of constructor
public int getCat1(){
return cat1;
}//End of getcat1
public int getCat2(){
return cat2;
}//End of getcat2
public int getExam(){
return exam;
}//End of getexam
public static String grading(double m){
String gde;
if(m>=70)
gde="A";
else
if(m>=60)
gde="B";
else
if(m>=50)
gde="C";
else
if(m>=40)
gde="D";
else
gde="F";
return gde;
}
}//End of class marks
