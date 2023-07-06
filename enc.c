#include<stdio.h>
//encode funtion
void enc(char s[],int k){
for(int i=0;s[i]!='\0';i++){
    s[i]+=k;
    if(s[i]>'z') s[i]-=26;
}
}
//decode function
void dec(char s[],int k){
for(int i=0;s[i]!='\0';i++){
    s[i]-=k;
    if(s[i]<'a') s[i]+=26;
}
}
int main(){
    char s[99],o; int k;
    printf("Enter a string: "); 
    gets(s);    //string input
    printf("Enter the shift factor: ");
    scanf("%d",&k); //shift fator input
    printf("Encode or Decode? (e or d): ");
    scanf(" %c",&o); //user choice input
    if(o=='e') enc(s,k);
    else if(o=='d') dec(s,k);
    else {printf("Invalid option"); return 0;}
    printf("Encoded string: %s",s); //printing the modified string
    return 0;
}
