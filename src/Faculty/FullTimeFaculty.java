package Faculty;

import Faculty.Faculty;

public class FullTimeFaculty extends Faculty
{
    float basic;
    float allowance;

    FullTimeFaculty(float basic,float allowance){
        this.basic=basic;
        this.allowance=allowance;
    }

    float salaryF(){
        float salary1;
        salary1=(basic+allowance);
        return salary1;
    }

    void display1(){
        System.out.println(" "+salaryF());
    }
}
