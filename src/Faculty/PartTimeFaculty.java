package Faculty;

import Faculty.Faculty;

public class PartTimeFaculty extends Faculty {
    int hour;
    float rate;
    PartTimeFaculty(int hour,float rate){
        this.hour=hour;
        this.rate=rate;
    }

    float salaryP(){
        float salary2;
        salary2=(hour*rate);
        return salary2;
    }

    void display2(){
        System.out.println(""+ salaryP());
    }
}
