package JSB.emp;


public class EmployeeJDBC extends JDBCUtil {
    public static String insertEMP = "insert  into employees values (?,?,?,?,?,?,?,?,?,?,?)";
    public static String selectEmp = " select employee_id, last_name,email,job_id,manager_id,department_id\n" +
            " from employees; ";
    public static String selectOneEmp = "select * from employees where employee_id=?";
    public static String updateEMP = " update employees set first_name = ?,last_name = ?, email = ?,phone_number = ?, hire_date = ? where employee_id = ?";
    public static String delectEMP = "delete from employees where employee_id  = ?";

}
