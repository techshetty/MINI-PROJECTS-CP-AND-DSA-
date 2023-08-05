import random as rdm
asc="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
spec="!@#$%^&*()"
pwd=""
ltr=int(input("How many letters do you wan't in your password? "))
num=int(input("How many numbers do you wan't in your password? "))
sym=int(input("How many symbols do you wan't in your password? "))

for i in range(ltr):
    pwd+=rdm.choice(asc) #generate random letters
for i in range(num):
    pwd+=str(rdm.randint(0,9)) #generate random numbers
for i in range(sym):
    pwd+=rdm.choice(spec) # generate random special characters
pwd="".join(rdm.sample(pwd,len(pwd))) #to randomise the characters of the password
print("This is your password as per your requirements: "+pwd)