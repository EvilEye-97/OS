import random

print("Welcome to Rock Paper Scissors game")
print("1: For Rock \n2: For Paper \n3: For Scissors")
options=["Rock","Paper","Scissor"]
item=[1,2,3]
x=int(input("Enter Choice: "))
while True: 
    if x in item:
         break
    else:
        print("Invalid")
player=options[x-1]
print(f"You chose {player}")
computer=random.choice(options)
print(f"Computer chose {computer}")
if player==computer:
    print("Its A Tie")
elif player=="Rock" and computer=="Paper" or player=="Paper" and computer=="Scissor" or player=="Scissor" and computer=="Rock":
    print("Computer Wins")
else:
    print("Player Wins")

    
