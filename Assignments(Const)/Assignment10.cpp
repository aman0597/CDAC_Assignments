/*Write a program to print the volume of a box by creating a class named 'Volume' with an
initialization list to initialize its length, breadth and height. (just to make you familiar with
initialization lists)*/
#include <iostream>
using namespace std;

class Volume 
{
private:
    float length, breadth, height;

public:
    Volume(float l, float b, float h) : length(l), breadth(b), height(h) {}

    float get() 
	{
        return length * breadth * height;
    }
};

main() 
{
    float length, breadth, height;

    cout << "Enter length of box: ";
    cin >> length;
    cout << "Enter breadth of box: ";
    cin >> breadth;
    cout << "Enter height of box: ";
    cin >> height;

    Volume box(length, breadth, height);

    cout << "Volume of the box: " << box.get() << " cubic units" << endl;
}
