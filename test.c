#include<stdio.h>
void enc(char s[],int k){
for(int i=0;s[i]!='\0';i++){
    s[i]+=k;
}
}
void main(){
    char s[20]; int k;
    printf("Enter a string:: ");
    gets(s);
    printf("Enter the shift factor: ");
    scanf("%d",&k);
    enc(s,k);
    printf("Encoded string: %s",s);

}