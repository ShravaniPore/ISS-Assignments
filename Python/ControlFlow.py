import Datatypes as dt
# print(dt.List1)

def askSubject():
    subject = input("\nEnter a subject (IS, IOE, MIS, IRS): ")
    subject=subject.upper()
    return subject

# if-else
print("if-else demo")
if dt.Is_female_Bool==True:
    print(f"{dt.Name} is a female.")
else:
    print(f"{dt.Name} is a male.")

# for loop
print("\nFor loop demo \nElectives chosen are:")
for i in dt.Electives_Tuple:
    print(i)

# while loop
print("\nWhile loop demo" )
subject=askSubject()
while subject in dt.Electives_Tuple:
    print(f"{subject} marks: {dt.Marks_Dict[subject]}")
    subject = input("Enter another subject (or something else to stop): ")
    subject=subject.upper()

# Find Subjects with marks>85
# break and continue
print("\nBreak-Continue demo" )
while True:
    subject=askSubject()
    if dt.Marks_Dict[subject]>85:
        print("Marks>85")
        break

    elif dt.Marks_Dict[subject]<85:
        print("Marks<85")
        continue

    elif subject not in dt.Marks_dict:
        print("Invalid Subject")
        continue

    elif subject=="EXIT":
        print("Exiting the loop")
        break

# Pass keyword
for x in dt.Labs_Set:
    pass

#else in for loop
print("\nelse in for loop demo" )
subject=askSubject()
for sub in dt.Electives_Tuple:
    if sub==subject:
        print("found")
else:
    print("Search complete")
    

