import random

print("Lets play heads or tails")
userChoice = int(input("press 1 for head or 2 for tail : "))
#print(a)
toss = random.randrange(1,3)
print(toss)
if toss == userChoice :
	print( "Player wins...!" )
else:
	print( "Computer wins...!" )
