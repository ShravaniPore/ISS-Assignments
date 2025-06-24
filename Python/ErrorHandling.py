# try except else finally block

try:
    divisor=int(input("Enter a number to divide 100 with: "))
    result=100/divisor
except ZeroDivisionError:
    print("ZeroDivision error occured, you cannot divide by 0.")
except ValueError:
    print("Value error occured, enter a valid number.")
else:
    print(f"{result} is the answer.")
finally:
    print("This is finally block and it always executes.")

# raising the exception

print("\nExample of raising an exception.")
age=int(input("Enter your age: "))
if(age<0):
    raise ValueError("Age cannot be negative")

print(f"Your entered age:{age}")


