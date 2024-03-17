/*Write a program that would print the information (name, year of joining, salary, address) of three
employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat*/

#include <iostream>
#include <string>
using namespace std;

class Employee 
{
private:
    string name;
    int yearOfJoining;
    float salary;
    string address;

public:
    Employee(string n, int y, float s, string a) : name(n), yearOfJoining(y), salary(s), address(a) {}

    void get() 
	{
        cout << name << "\t" << yearOfJoining << "\t" << salary << "\t" << address << endl;
    }
};

main() 
{
    Employee emp1("Rahul", 2008, 53000.0, "Nagpur");
    Employee emp2("Sanjay", 2012, 66000.0, "Jalgaon");
    Employee emp3("Jay", 2011, 50000.0, "Nashik");

    cout << "Name\tYear of joining\tSalary\tAddress" << endl;
    emp1.get();
    emp2.get();
    emp3.get();
}

