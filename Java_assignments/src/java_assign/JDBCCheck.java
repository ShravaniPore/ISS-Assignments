package java_assign;

public class JDBCCheck {
    public static void main(String[] args) {
        try{
            JDBC c=new JDBC();
            String query1=" insert into students (student_id,student_name,email,dept_id,marks) values (21,'Arya','Arya@gmail.com',2,80)";
            c.s.executeUpdate(query1);
            System.out.println("Data Inserted successfully.");
            c.conn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
