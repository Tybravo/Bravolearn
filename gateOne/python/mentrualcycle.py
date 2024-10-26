
length_cycle = int(input("Enter your menstrual period length cycle (in days): "))
lastperiod_daystarted = int(input("Enter the day of the month you got your last period started: "))

dayof_ovulation = (lastperiod_daystarted + length_cycle - 14) % 30
if dayof_ovulation <= 0:
	dayof_ovulation = dayof_ovulation + 30

nextperiod_daystart = (lastperiod_daystarted + length_cycle) % 30
if nextperiod_daystart <= 0:
	nextperiod_daystart = nextperiod_daystart + 30



print()
print("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
print("Your Cycle Information:")
print(f"Your ovulation date: Day {dayof_ovulation} by counting forward")
print(f"Your next period start date: Day {nextperiod_daystart} by counting forward")
print()
print("Take note that the information above may vary for individuals")
print("as the app ensures that the cycle-day stays within 30 days")
print("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")

