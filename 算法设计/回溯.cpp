#include <iostream>
#include<cstdio>
#include<string.h>
#include<algorithm>
using namespace std;
#define N 100
struct goods{
int wight,value;
}goods[N];
int n,bestValue,cv,cw,C;
int X[N],cx[N];
int BackTrack(int i){
    if(i > n-1){
        if(bestValue < cv){
            for(int k = 0; k < n; k++)
                X[k] = cx[k];
            bestValue = cv;
        }
        return bestValue;
    }
if(cw + goods[i].wight <= C){
    cw += goods[i].wight;
        cv += goods[i].value;
        cx[i] = 1;
        BackTrack(i+1);
        cw -= goods[i].wight;
        cv -= goods[i].value;    }
    cx[i] = 0;
    BackTrack(i+1);
    return bestValue;
}
bool m(struct goods a, struct goods b){
    return (a.value/a.wight) > (b.value/b.wight);
}
int KnapSack3(int n, struct goods a[], int C,int x[N]){
    memset(x,0,sizeof(x));
    sort(a,a+n,m);
    BackTrack(0);
    return bestValue;
}int main()
{
    cout<<"��Ʒ����n��";
    cin>>n;
    cout<<"��������C��";
    cin>>C;
    for(int i = 0; i < n; i++){
        printf("��Ʒ%d������w[%d]�����ֵv[%d]��",i+1,i+1,i+1);
        scanf("%d%d",&goods[i].wight,&goods[i].value);
    }
    int sum3 = KnapSack3(n,goods,C,X);
    printf("���ݷ����0/1��������:\nX=[");
    for(int i = 0; i < n; i++)
        cout << X[i] <<" ";//�������X[n]����
    cout<<"]   װ���ܼ�ֵ\n"<<sum3;
    return 0;
}

