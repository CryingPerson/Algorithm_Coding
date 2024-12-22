#include <stdio.h>
main()
{
double	 c,a,b =0;
	 
	scanf("%d",&a);
	scanf("%d",&b); 
	
	c=a/b;
	if(a>0 && b<10){
		printf("%.9f\n",c);
	}else{
	
	printf("오류입니다.");
 }
}