#include <iostream>
#include <math.h>

using namespace std;

int TongChan(int n)
{
    int sum = 0;
    for(int i = 0; i <= n; i ++)
    {
        if(i % 2 == 0)
        {
            sum += i;
        }
    }
    return sum;
}

float TongNghichDao(int n)
{
    float sum = 0.0f;
    for(int i = 1; i < n; i ++)
    {
        sum = sum + (float)(1/i);
    }
    return sum;
}

bool KiemTraNT(int n){
    if(n <= 2){
        return 0;
    }
    for(int i = 2 ; i < sqrt(n); i ++){
        if(n % 2 == 0){
            return 0;
        }
    }
    return 1;
}

int main()
{
    cout << "Tong chan: " << TongChan(13) << endl;
    cout << "Tong nghich dao: " << TongNghichDao(5) << endl;
    return 0;
}
