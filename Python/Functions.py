Class={'A':78,'B':50,'C':60,'D':89}

# function without parameter
def showClass():
    print(Class)

# with parameter and default arg
def addStudent(student,att=0):
    Class[student]=att
    print(Class)

# with parameter and return type
def checkStudent(student: str)->bool:
    if student in Class:
        return True
    else:
        return False

def updateAttendance():
    student=input("Enter the name of student you wish to update attendance for:")
    if checkStudent(student):
        Att=input("Updated attendance:")
        Class[student]=Att
        print("Updated successfully")
    else:
        print("student doesn't exist")

# args example
def totalMarks(*args):
    print(f"{sum(args)} is the total of marks in {len(args)} subjects.")

print("Example of args: ")
print("Example 1")
totalMarks(20,19,13,18)
print("Example 2")
totalMarks(20,20,20)
print("Example 3")
totalMarks()
print("Example 4")
totalMarks(10,20,11,10,20)

# kwargs example
def showMarks(**kwargs):
    for subject,marks in kwargs.items():
        print(f"{subject} : {marks}")

print("\nExample of kwargs")
print("Example 1")
showMarks(Maths=20,AIDS=15)
print("\nExample 2")
showMarks(Blockchain=19,UID=17,AT=15)



while True:
    choice=input("\n1.Add new Student\n2.Update student's attendance\n3.Show Class\n4.Exit\nChoose one operation: ")

    if choice=='1':
        student_data=input("Enter name and attendance of new student:")
        student,att=student_data.split()
        addStudent(student,att)
        continue
    elif choice=='2':
        updateAttendance()
        continue
    elif choice=='3':
        showClass()
        continue
    elif choice=='4':
        break
    else:
        print("Invalid operation")
        continue

