import java.util.*;
class Matrix 
{
	int mat[][]=new int[2][2];
	double inv[][]=new double[2][2];
	Matrix()
	{
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Elements of the 2x2 matrix:");
	for(int i=0;i<2;i++)
	{
	for(int j=0;j<2;j++)
	{

           mat[i][j]=sc.nextInt();
         }
        }
	}

    Matrix(Matrix k)
   {

        for(int i=0;i<2;i++)
	{

            for(int j=0;j<2;j++)
		{

                mat[i][j]=k.mat[i][j];

            	}

        }

    }

     int Determinant()
	{

        return (mat[0][0]*mat[1][1]-mat[0][1]*mat[1][0]);

    	}

    

    void Inverse()
	{

        double d=Determinant();
	if(isSingular())
          System.out.println("The inverse cannot be found as the determinant is 0.");
	else
	{

            inv[0][0]=mat[1][1]/d;

            inv[0][1]=-mat[0][1]/d;

            inv[1][0]=-mat[1][0]/d;

            inv[1][1]=mat[0][0]/d;

        }

    }

    

    boolean isSingular()
	{

        if(Determinant()==0)
	 return true;
	 else 
		 return false;

        }

     void print()
	{

        System.out.println("The Matrix is");

        for(int ar[]:mat)
	{
            for(int x:ar)
		{
                System.out.print(x+" ");
            }
            System.out.print("\n");

        }

        System.out.println("The Determinant of the matrix is "+Determinant());

        if(!isSingular())
	{

            System.out.println("The inverse of the matrix  is");
            Inverse();
            for(double ar[]:inv)
		{
                for(double x:ar)
		{
                    System.out.print(x+" ");
                }
                System.out.print("\n");
            }   

        }
        if(isSingular())
            System.out.println("The matrix is singluar hence it's inverse can't be found.");
               else
        System.out.println("The matrix is not singluar.");

        }

}

class MatrixINVDemo
{
    public static void main(String args[])
	{
        Matrix m=new Matrix();
	m.print();
	 }

}