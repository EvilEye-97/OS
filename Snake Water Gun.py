import random

def game():
    lt=["Snake","Water","Gun"]
    num=[1,2,3]
    print("Hello and welcome to Snake Water Gun")
    print("1: For Snake")
    print("2: For Water")
    print("3: For Gun")

    while True:
        x=int(input("Enter Number: "))
        if x in num:
            break
        else:
            print("Invalid")

    ply=lt[x-1]
    print(f"You chose: {ply}")
    comp=random.choice(lt)
    print(f"System chose: {comp}")
    if ply==comp:
       print("Its a tie")
    elif ply=="Snake" and comp=="Water" or ply=="Water" and comp=="Gun" or ply=="Gun" and comp=="Snake":
        print("Player Wins!!!")
    else:
        print("System Wins!!!")

game()
    