print("\nBMI Calculator")

print("\nSelect your Unit of Measurement")

measure_unit = input("\nI for Imperial || M for Metric: ")

if measure_unit == 'M':
    weight = float(input("\nInput your weight: "))
    height = float(input("Input your Height(in cm): "))
    print("\nYour Weight is " + str(weight) + " kg")
    print("\nYour Height is " + str(height) + " cm")

    bmi = (weight/((height/100)**2))
    
elif measure_unit == "I":
    weight = float(input("\nInput your weight: "))
    height = float(input("Input your Height(in inches): "))
    print("\nYour Height is " + str(height) + " inc")
    print("\nYour Weight is " + str(weight) + " lbs")
    
    bmi = (weight/(height**2))*703

else:
    print("\nInvalid input")    
    
print("\nYour Body Mass Index is " + str(bmi))
        
if (bmi < 18.5):
        print("\nYou are underweight")
elif (bmi >= 18.5 and bmi <= 24.9):
        print("\nYou are normal")
elif (bmi >= 25 and bmi <= 29.9):
        print("\nYou are overweight")
elif (bmi >= 30 and bmi <= 34.9):
        print("\nYou are overweight")
elif (bmi >= 35):
        print("\nYou are obese")
else:
    print("\nInvalid input")

