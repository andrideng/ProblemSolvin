the_list= []

print("Enter the size of the Array:")
N = int(input())

for x in range(N):
    x = input("")
    try:  
        the_list.append(int(x))
    except ValueError:
        the_list.append(x)

print("Given array: ", the_list)
num = int(input("Enter a number: "))
loc = (num) % len(the_list)
print("Output: ",the_list[loc-1])