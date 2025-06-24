# Explicit type conversion
# Conversion dictionary->tuple
import Datatypes as dt
print(dt.Marks_Dict,type(dt.Marks_Dict))
dictToTuple=tuple(dt.Marks_Dict)
print(dictToTuple,type(dictToTuple))

# Conversion int->float
age=21
print(f"\nType of Age: {type(age)}")
age=float(age)
print(f"Age after converting it from int to float is {age}, {type(age)}")

# Conversion String->set
string="Assignment"
print("\n",string,type(string))
string=set(string)
print("After Conversion:")
print(string,type(string))

# Implicit type conversion
number1=11
print(f"\nFirst number: {number1}, {type(number1)}")
number2=11.1
print(f"First number: {number2}, {type(number2)}")
addition=number1+number2
print(f"Answer is: {addition}, {type(addition)}")


