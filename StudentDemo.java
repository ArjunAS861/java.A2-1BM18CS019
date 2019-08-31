import java.util.*;
class Student 
{

    double student[][];
    int r,c;
    Student(int r,int c)
	{
        this.r=r;
        this.c=c;
        student=new double[r+2][c+2];	
    	}

    void Enter()
{
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<r;i++)
	{

            System.out.println("Enter the marks obtained in each of the "+c+" subjects by student"+(i+1));
            for(int j=0;j<c;j++)
	{
                student[i][j]=sc.nextDouble();
        }
        }
}

       void total_avg_cal()
{

        int i,j;

        for(j=0;j<c;j++)
	{

            double sum=0;

            for(i=0;i<r;i++){

                sum+=student[i][j];

            }

            student[i][j]=sum;

            student[i+1][j]=sum/r;

        }

    }

    void total_avg_stud(){

        int i,j;

        for(i=0;i<r;i++){

            double sum=0;

            for(j=0;j<c;j++){

                sum+=student[i][j];

            }

            student[i][j]=sum;

            student[i][j+1]=sum/c;

        }

    }

    void print()
	{

        Enter();

        total_avg_cal();

        total_avg_stud();

        for(int i=0;i<r;i++)

            System.out.println("The total and average marks of student "+(i+1)+" are "+student[i][c]+" and"+student[i][c+1]);
              for(int j=0;j<c;j++)
            System.out.println("The total and average marks in subject "+(j+1)+" are "+student[r][j]+" and"+student[r+1][j])

    	}

        

}



class StudentDemo 
{
    public static void main(String args[])
{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of students and the No. of subjects");
        int r=sc.nextInt();
        int c=sc.nextInt();
        Student s=new Student(r,c);
        s.print();

}
}