public class Student {
    String name;
    int mark1;
    int mark2;
    int mark3;

    public Student(String name,int mark1,int mark2,int mark3){
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }

    public double average(){
        int sum=0;
        sum=mark1+mark2+mark3;
        double avg=sum/3.0;
        return avg;
    }

    public void display(){
        double avg=average();
        System.out.println("Name: "+ name);
        System.out.printf("Average: %.2f%n",avg);

        if(avg<50){
            System.out.println("Result: fail \n Grade: F");
        }
        else if(avg>=90){
            System.out.println("Result: pass \n Grade: A");
        }
        else if(avg>=75){
            System.out.println("Result: pass \n Grade: B");
        }
        else if(avg>=60){
            System.out.println("Result: pass \n Grade: C");
        }
        else if(avg>=50){
            System.out.println("Result: pass \n Grade: D");
        }

    }

}
