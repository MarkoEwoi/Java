import java.io.*;
import java.util.*;                                                                                                                                                                                                                                                                                             
class Student extends Subject{
int stnum;
String stname;
Subject[] sbj=new Subject[7];
public void setNumber(int n){
stnum=n;
}
public void setStName(String nm){
stname=nm;
}
public int getNumber(){
return stnum;
}
public String getStName(){
return stname;
}
}//End of Class Student
