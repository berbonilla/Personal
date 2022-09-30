name = input("Enter your full name in:")
low = name.lower()
name.replace(" ", "")
output=[]
i=0
for i in low:
    number = ord(i)-96
    output.append(number)
print("The numerical values of the letters on your name is:")
print(output)
print("The sum of the equivalent values of each letter of your name is :")
print (sum((output)))
