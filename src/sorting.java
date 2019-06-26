import java.util.Scanner;
public class sorting {
    //main class
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter the num");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sort(n);

    }
    //to sort the given numbers in non-decreasing order
    public static void sort(int m)
    {
        int count=0;
        int array[]=new int[10];
        while(m>0)
        {
            array[count]=m%10;
            count=count+1;
            m=m/10;
        }
        int temp=0;
        for(int i=0;i<count;i++)
        {
            for(int j=i+1;j<count;j++)
            {
                if(array[i]<array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

int r=0;
for(int i=0;i<count;i++)
        {
            r=(r*10)+array[i];
        }
       System.out.println("sorted number: "+r);
       int sum=0;
       for(int i=0;i<count;i++)
       {
           if(array[i]%2==0)
           {
               sum=sum+array[i];
           }
       }
        System.out.println("sum of even numbers: "+sum);
       if(sum>15)
       {
           System.out.println("true");
       }
       else
       {
           System.out.println("false");
       }
       }
    }