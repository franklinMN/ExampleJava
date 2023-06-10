import random

print("Play ODD or EVEN")

while True:
	odd_or_even = int(input("press 1 for odd and press 2 for even : "))
	if odd_or_even == 1 or odd_or_even == 2:
		break
	else:
		print("Please enter correct value...")

userchoice = int(input("choose values from 1 to 6 : "))
computer_choice = random.randrange(1,7)
sum = userchoice+computer_choice
print("Sum = ", sum)
if (sum%2 == odd_or_even%2):
	print( "Player Wins...!" )
else:
	print( "Computer Wins....!" )
