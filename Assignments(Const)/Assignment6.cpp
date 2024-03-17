/*Write a program to print the area of a rectangle by creating a class named 'Area' having two
functions. First function named as 'setDim' takes the length and breadth of the rectangle as
parameters and the second function named as 'getArea' returns the area of the rectangle. Length and
breadth of the rectangle are entered through keyboard.*/
#include <iostream>
using namespace std;

class Area 
{
private:
    float length, breadth;

public:
    void setDim(float l, float b) 
	{
        length = l;
        breadth = b;
    }

    float getArea() 
	{
        return length * breadth;
    }
};

main() 
{
    float length, breadth;
    Area rectangle;

    cout << "Enter length of rectangle: ";
    cin >> length;
    cout << "Enter breadth of rectangle: ";
    cin >> breadth;

    rectangle.setDim(length, breadth);

    cout << "Area of rectangle: " << rectangle.getArea() << " square units" << endl;

}
