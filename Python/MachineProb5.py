ColorList = ['Red','Orange','Yellow','Green','Blue','Violet']
print (ColorList)
tanggalin = [0, 3, 4] 
for ele in sorted(tanggalin, reverse = True):  
    del ColorList[ele] 
print (ColorList)
