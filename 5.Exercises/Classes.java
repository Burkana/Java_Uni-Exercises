import java.util.*;
public class Classes {

public class Hospital {
String name = "Best Hospital";
String addres = "str. No_one knows";
int phone = 12345678;

}
public class Departament extends Hospital{}


public class Staff extends Departament{
    String joined; 
    String education;
    String certification; 
    String languages;
}

public class Aministrative_Staff extends Staff{}
public class FrontDesk_Staff extends Aministrative_Staff{}
public class Receprionist_Staff extends FrontDesk_Staff{}

public class Technical extends Staff{}
public class Tech_guy extends Technical{}
public class Technologist extends Technical{}
public class Surgical_Technologist extends Technologist{}

public class Person extends Hospital{
    String title;
    String given_name;
    String middle_name;
    String family_name;
    String fullname = given_name + middle_name + family_name;
    String birth_date;
    String gender;
    String home_addres;
    int phone;   

}

public class Patient extends Person{

    String id;
    String name = fullname;
    String birth_date;
    String gender;
    int age;
    String accepted;
    String sickness;
    String prescription;
    String allergies;
    String specialRwqs;
}

public class Operation_Staff extends Staff{}
public class Nurse extends Operation_Staff{}
public class Doctor extends Operation_Staff{
String specialty;
String location;
}
public class Surgeon extends Doctor{}

public static void main(String args[]){
}
}