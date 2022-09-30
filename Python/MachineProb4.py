emplist = [] 
for i in range(111): 
    NumIn= input("Maglagay ng numero: ")
    emplist.append(NumIn)
    if NumIn=="fin":
        break
emplist.remove("fin")
TotNum == len(emplist)

print("Total numbers", (TotNum))
