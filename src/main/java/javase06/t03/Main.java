package javase06.t03;

import javase06.t03.Helper.Doctor;
import javase06.t03.Helper.HeadDoctor;
import javase06.t03.Helper.MedicalStaff;
import javase06.t03.Helper.Nurse;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor();
        //Doctor doctor2 = new MedicalStaff();
        Doctor doctor3 = new HeadDoctor();
        Object object1 = new HeadDoctor();
        //HeadDoctor doctor5 = new Object();
        //Doctor doctor6 = new Nurse();
        //Nurse nurse = new Doctor();
        Object object2 = new Nurse();



        List<Doctor> list1= new ArrayList<Doctor>();
//        List<MedicalStaff> list2 = new ArrayList<Doctor>();
//        List<Doctor> list3 = new ArrayList<MedicalStaff>();
//        List<Object> list4 = new ArrayList<Doctor>();
        List<Object> list5 = new ArrayList<Object>();

    }
}
