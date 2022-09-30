def sequentialSearch(numblist, nextval):
    CurPos = 0
    NumFound = False
    while CurPos < len(numblist) and not NumFound:
        
        if numblist[CurPos] == nextval:
            NumFound = True
        else:
            CurPos = CurPos+1

    return NumFound

input_string = int(input("Enter 10 Numbers:"))
userList = input_string
LinearList = userList

x =int(input("What number are you finding?:"))
xfound = sequentialSearch(LinearList, x)
if xfound:
    print("The number is  in index: ")
else:
    print("The number is not in the list")
