rows=int(input('Enter The Number Of Rows'))

for i in range (0,rows):
    for j in range (0,rows-i):
        print("*",end=" ")

    print()
