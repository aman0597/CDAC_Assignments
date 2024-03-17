/*Assign and print the roll number, phone number and address of two students having names "Sam"
and "John" respectively by creating two objects of the class 'Student'*/
#include<iostream>
#include <string>
using namespace std;

class Student
{
public:
    string name,address,phone;
    int roll_no;
};

main()
{
    Student s1;
    s1.name = "Rohan";
    s1.roll_no = 23;
    s1.phone = "3478937271";
    s1.address = "Nashik";

	Student s2;
    s2.name = "Prajakta";
    s2.roll_no = 16;
    s2.phone = "7827342628";
    s2.address = "Pune";

    cout<<" Student Details "<< endl;
    cout<<" Student Name : "<< s1.name << endl;
    cout<<" Student Roll No : "<< s1.roll_no << endl;
    cout<<" Student Cell : "<< s1.phone << endl;
    cout<<" Student Address : "<< s1.address << endl;
    cout<<"\n---------------------------------------" << endl;

    cout<<" Student Name : "<< s2.name << endl;
    cout<<" Student Roll No. : "<< s2.roll_no << endl;
    cout<<" Student Phone No. : "<< s2.phone << endl;
    cout<<" Student Address : "<< s2.address << endl;
    cout<<"\n---------------------------------------" << endl;
}
