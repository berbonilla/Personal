print("\nProblem 1. 10 pts")
print("Twinkle, twinkle, little star,\n\t How I wonder what you are!, \n\t\t Up above the world so high,\n\t\t Like a diamond in the sky,\nTwinkle, twinkle, little star,\n\t How I wonder what you are!")

print("\nProblem 2. 10 pts")
radius = float(input("Input a positive radius: "))
if not (radius <= 0):
    print("The area of the sphere is",3.1416*(radius**2))
else:
    print("Input a positive integer!")
    

print("\nProblem 3. 10 pts")
radius = float(input("Input a positive radius: "))
volume = ((4/3)*((3.1416*(radius**3))))
if not (radius <= 0):
    print(f"The volume of the sphere is {volume} ")
else:
    print("Input a positive integer!")


print("\nProblem 4. 20 pts")
num1 = int(input("Input a positive number: "))
num2 = int(input("Input a positive number: "))
sum = num1 + num2
product = num1 * num2
if not ((num1 <= 0) or (num2 <= 0)):
    if product < 1000:
        print(f"\nThe product of the two numbers is {product} ")
    else:
        print(f"\nThe sum of the two numbers is {sum} ")
else:
    print("Input a positive integer!")

print("\nProblem 5. 20 pts")
num1 = int(input("Input a positive number: "))
num2 = int(input("Input a positive number: "))
num3 = int(input("Input a positive number: "))
sum = num1 + num2 + num3
if not ((num1 <= 0) or (num2 <= 0)):
    if num1 == num2 or num2 == num3 or num1 == num3:
        print("\nPlease try again.")
    else:
        print(f"\nThe sum of the two numbers is {sum} ")
else:
     print("Input a positive integer!")
    
print() 

print("\nProblem 6. 20 pts")
for i in range (20,0,-1):
    modulo = i % 3
    if modulo != 0:
        print(i)

print("\nProblem 8. 30 pts")
for n in range(1,41,1):
    if n % 3 == 0 or n % 5 == 0:
        if not ((n % 3) == 0 and  (n % 5 == 0)):
            print(n)

print("\nProblem 9. 30 pts")

Birthyear = int(input("Input your birthyear: "))
age = 2022 - Birthyear
if Birthyear >= 1922 and Birthyear <= 1949:
    print(f"You are {age} years old;you might find Jazz music interesting")
elif Birthyear >= 1950 and Birthyear <= 1959:
    print (f"You are {age} years old;you might find Country music interesting")
elif Birthyear >= 1960 and Birthyear <=1969:
    print (f"You are {age} years old;you might find Rock music interesting!")
elif Birthyear >= 1970 and Birthyear <= 1979:
    print (f"You are {age} years old;you might find Disco music interesting!")
elif Birthyear >= 1980 and Birthyear <= 1989:
    print (f"You are {age} years old;you might find Pop music interesting!")
elif Birthyear >= 1990 and Birthyear <= 1999:
    print (f"You are {age} years old;you might find Rap music interesting!")
elif Birthyear >= 2000 and Birthyear <= 2009:
    print(f"You are {age} years old;you might find R&B music interesting!")
else: 
    print ("You may Listen to Any Genre")


print("\nProblem 10. 40 pts")
s1 = float(input("Input a the first side's length: "))
s2 = float(input("Input a the first side's length: "))
s3 = float(input("Input a the first side's length: "))
perimeter = s1 + s2 + s3 
s = .5*(s1+s2+s3)
area = (s*(s-s1)*(s-s2)*(s-s3)) ** 0.5
if  ((s1 <= 0) or (s2 <= 0) or (s3 <= 0)):
    print("At least one of the sides is zero or negative")

elif not ((s1 <= 0) or (s2 <= 0) or (s3 <= 0)):
    if (s1 + s2 < s3) or (s2 + s3 < s1) or (s1 + s3 < s2):
        print("Triangle inequality is not met.")
    else:
        print(f"The area of the triangle is {area} square units.\n")

