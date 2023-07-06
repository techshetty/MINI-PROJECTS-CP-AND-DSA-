#include<stdio.h>
#include<string.h>
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
    char s[99],o[7]; int k;
    printf("Type encode to encrypt and decode to decrypt: ");
    scanf("%s",o); //user choice input
    printf("Type the message: "); 
    scanf("\n"); //handles the newline character
    gets(s);    //string input
    printf("Enter the number of shifts: ");
    scanf("%d",&k); //shift fator input
    if(strcmp(o,"encode")==0) enc(s,k);
    else if(strcmp(o,"decode")==0) dec(s,k);
    printf("Encoded string: %s",s); //printing the modified string
    return 0;
}
