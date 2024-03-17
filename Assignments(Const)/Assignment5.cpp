/*Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
creating a class named 'Rectangle' with a function named 'Area' which returns the area. Length and
breadth are passed as parameters to its constructor.*/
#include <iostream>
using namespace std;

class Rectangle 
{
private:
    float length, breadth;

public:
    Rectangle(float l, float b) 
	{
        length = l;
        breadth = b;
    }

    float Area() 
	{
        return length * breadth;
    }
};

main() 
{
    Rectangle r1(8, 3);
    Rectangle r2(2, 7);

    cout << "Area of Rectangle 1: " << r1.Area() << " square units" << endl;
    cout << "Area of Rectangle 2: " << r2.Area() << " square units" << endl;
}
