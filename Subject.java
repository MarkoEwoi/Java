import java.io.*;
import java.util.*;
class Subject extends Marks{
String code;
String sname;
Marks mk=new Marks();
public void setCode(String c){
code=c;
}
public void setName(String n){
sname=n;
}
public String getCode(){
return code;
}
public String getName(){
return sname;
}
}//End of Class Subject
