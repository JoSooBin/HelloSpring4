package JSB.emp;

import java.util.ArrayList;
import java.util.Scanner;

/*
* 성적처리 추상클래스를 상속해서 만든 클래스
* */
public class EmployeeV3Service  {
    public void displayMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------\n")
                .append("인사 관리 프로그램 v8\n")
                .append("-------------------\n")
                .append(" 1. 인사 데이터 입력\n")
                .append(" 2. 인사 데이터 조회\n")
                .append(" 3. 인사 데이터 상세조회\n")
                .append(" 4. 인사 데이터 수정\n")
                .append(" 5. 인사 데이터 삭제\n")
                .append(" 0. 프로그램 종료 \n")
                .append("-------------------\n")
                .append( " 원하시는 작업은 ? [0,1,2,3,4,5,0] ");
        System.out.print(sb);
    }

    public void newEmployees() {
        EmployeeVo emp = new EmployeeVo();

        Scanner sc = new Scanner(System.in);

        System.out.print("사번을 입력하세요 : ");
        emp.setEmpno(Integer.parseInt(sc.nextLine()));
        System.out.print("이름을 입력하세요 : ");
        emp.setFname(sc.nextLine());
        System.out.print("성을 입력하세요 : ");
        emp.setLname(sc.nextLine());
        System.out.print("이메일을 입력하세요 : ");
        emp.setEmail(sc.nextLine());
        System.out.print("전화번호를 입력하세요 : ");
        emp.setPhone(sc.nextLine());
        System.out.print("입사일 입력하세요 : ");
        emp.setHdate(sc.nextLine());
        System.out.print("직책을 입력하세요 : ");
        emp.setJobid(sc.nextLine());
        System.out.print("급여를 입력하세요 : ");
        emp.setSal(Integer.parseInt(sc.nextLine()));
        System.out.print("수당을 입력하세요 : ");
        emp.setComm(Double.parseDouble(sc.nextLine()) );
        System.out.print("상사번호를 입력하세요 : ");
        emp.setMgrid(Integer.parseInt(sc.nextLine()));
        System.out.print("부서번호를 입력하세요 : ");
        emp.setDeptid(Integer.parseInt(sc.nextLine()));

        String result = EmployeeV3DAO.insertEmp(emp);
        System.out.println(result);
    }

    public void readEmployees() {
       StringBuilder sb = new StringBuilder();
        String fmt = "%10s %10s %10s %10s %10s %10s\n";

        String result = String.format(fmt,"empno","lname","email","jobid","mgrid","deptid");
       sb.append(result);

       ArrayList<EmployeeVo> emps = EmployeeV3DAO.selectEmp();

       for(EmployeeVo emp : emps){
           result = String.format(fmt, emp.getEmpno(),emp.getLname(),emp.getEmail(),emp.getJobid()
                   , emp.getMgrid(),emp.getDeptid());
           sb.append(result);
       }
        System.out.println(sb.toString());
    }

    public void readOneEmployees() {
        String fmt = "%10s %10s %10s %10s %10s " +
                "%10s %10s %10s %10s %10s %10s\n";

        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 사원번호는?");
        String empid = sc.nextLine();

        EmployeeVo emp = EmployeeV3DAO.selectOneEmp(empid);

        String result = String.format(fmt, emp.getEmpno(),emp.getFname(),emp.getLname(),
                emp.getEmail(),emp.getPhone(),emp.getHdate(),emp.getJobid(),emp.getSal(),
                emp.getComm(),emp.getMgrid(),emp.getDeptid());

        System.out.println(result);
    }

    public void modifyEmployees() {
        Scanner sc = new Scanner(System.in);
        EmployeeVo emp = new EmployeeVo();

        System.out.print("수정할 사원번호는?");
        emp.setEmpno(Integer.parseInt(sc.nextLine()));
        System.out.print("수정할 이름은? ");
        emp.setFname(sc.nextLine());
        System.out.print("수정할 성은?");
        emp.setLname(sc.nextLine());
        System.out.print("수정할 이메일은? ");
        emp.setEmail(sc.nextLine());
        System.out.print("수정할 전화번호는? ");
        emp.setPhone(sc.nextLine());
        System.out.print("수정할 입사일은? ");
        emp.setHdate(sc.nextLine());

        String result = EmployeeV3DAO.updateEmp(emp);
        System.out.println(result);

    }

    public void removeEmployees() {
        Scanner sc = new Scanner(System.in);

        System.out.println("삭제할 사원번호는?");
        int empid = sc.nextInt();

        String result = EmployeeV3DAO.deleteEmp(empid);
        System.out.println(result);
    }
}
