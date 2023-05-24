def fxn(s):
    lt=[]
    for i in range(s):
        y=int(input("Enter Elements: "))
        lt.append(y)
    for i in range(s):
        for j in range(s-i-1):
            if lt[j]>lt[j+1]:
                temp=lt[j]
                lt[j]=lt[j+1]
                lt[j+1]=temp
    print("List is: ",lt)

l=int(input("Enter Amount: "))
fxn(l)

# def sort(s):
#     n=s
#     a=list()
#     for i in range (n):
#         no=int(input("Enter number:l̥ "))
#         a.append(no)
#     for i in range(n):
#         for j in range(n-i-1):
#             if a[j] > a[j + 1]:
#                 tmp=a[j]
#                 a[j]=a[j+1]
#                 a[j+1]=tmp
#     print("Sorted list:", a)
# size=int(input("Enter array size: "))
# sort(size)