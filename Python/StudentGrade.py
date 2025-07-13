total = 0
counter = 1
while (counter <= 10):
	grade = int(input("Enter student grade: "))
	total = total + grade
	counter = counter + 1

average = total / 10
print("The total grade is: ", total)
print("The average of the grade is: ", average)