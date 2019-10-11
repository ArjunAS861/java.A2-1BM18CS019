import java.util.*

class Student{
     Scanner sc=new Scanner(System.in);
     String usn,name;
     int sem;
     void getData(){
         System.out.println("Enter name usn and semester");
         name=sc.next();
         usn=sc.next();
         sem=sc.nextInt();
     }
     
class Test extends Student{
    Scanner sc=new Scanner(System.in);
    int cie[]=new int[6];
    int credits[]=new int[6];
    credits={4,4,4,4,3,1};
    void getData(){
        System.out.println("Enter cie marks in each of the six subjects");
        for(int i=0;i<6;i++){
               cie[i]=sc.nextInt();
        }
}

class Exam extends Test{
     Scanner sc=new Scanner(System.in);
    int see[]=new int[6];
    void detData(){
        System.out.println("Enter the see marks in each of the six subjects");
        for(int i=0;i<6;i++){
            see[i]=sc.nextInt();
        }
}

class Result extends Exam{
    double sgpa;
    double sum=0;
    for(i=0;i<6;i++){
       sum+=(grade(cie[i]+see[i])*credits[i]);
    }
    sgpa=sum/20;
    float grade(int marks){
        if((marks>=90)&&(marks<=100)){
            return 10.00;
        }
        else if((marks>=75)&&(marks<90)){
            return 9.00;
         }
         else if((marks>=60)&&(marks<75)){
            return 8.00;
        }
         else if((marks>=50)&&(marks<60)){
            return 7.00;
        }
     }
}  

class Student_Cie
