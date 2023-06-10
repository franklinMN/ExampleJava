import random
print( "Guess The Number" )
while True:
	userchoice = int(input("Enter the number from 1 to 10 : "))
	if (userchoice>=1) and (userchoice<=10):
		break
	else:
		print( "Wrong Input, Please try again..." );
	

computerchoice = random.randrange(1,11)

print( "You choose : ", userchoice )
print( "You choose : ", computerchoice )

if (userchoice == computerchoice):
	print( "You Wins.....!" )
else:
	print( "You Lose.....!" ) 