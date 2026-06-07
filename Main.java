import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Student students[]=new Student[n];

        for(int i=0;i<n;i++){
            String name=sc.next();
            int mark1=sc.nextInt();
            int mark2=sc.nextInt();
            int mark3=sc.nextInt();

            students[i]=new Student(name,mark1,mark2,mark3);

        }

        for(int i=0;i<n;i++){
            students[i].display();
        }

        double max=students[0].average();
        int top=0;
        for(int i=0;i<n;i++){
            if(students[i].average()>max){
                max=students[i].average();
                top=i;
            }
        }

        System.out.println("Topper: "+students[top].name);

    }
}
