number = int(input("Input times to operate: "))

math = ['+','-','*','/']
count = 0

if number == 0:
    print(":(")

for x in range(number):
    print(math[count], end='')
    count += 1
    
    if count >= 4:
        count = 0
