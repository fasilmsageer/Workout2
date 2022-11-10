package Faculty;

import Faculty.FullTimeFaculty;
import Faculty.PartTimeFaculty;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args){
        Scanner scn1=new Scanner(System.in);
        FullTimeFaculty S1=new FullTimeFaculty(scn1.nextFloat(),scn1.nextFloat());
        FullTimeFaculty S2=new FullTimeFaculty(scn1.nextFloat(),scn1.nextFloat());
        PartTimeFaculty S3=new PartTimeFaculty(scn1.nextInt(),scn1.nextFloat());
        PartTimeFaculty S4=new PartTimeFaculty(scn1.nextInt(),scn1.nextFloat());
        S1.display1();
        S2.display1();
        S3.display2();
        S4.display2();
    }
}
