
Name="Shravani"
Age=21
Attendance=80.2
Electives_Tuple=('IS','MIS','IRS')
Labs_Set={'DS_lab','IOE_lab','SAD','ROSPL'}
Marks_Dict={'IS':86,'IOE':83,'MIS':91,'IRS':88}
is_female_Bool=True
List1=[Name,Age,Attendance,Electives_Tuple,Labs_Set,Marks_Dict,is_female_Bool]


if __name__=="__main__":
    # F-strings
    print(f"My name is {Name}. I am {Age} yo.")
    for i in List1:
        print(i,type(i))
