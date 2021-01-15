package JSB.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeV3DAO {
    // employees 테이블에서 사원번호,성,이메일,직책,상사,부서번호들을
    // 조회해서 ArrayList로 구성한 후 EmployeeV3Service로 넘김
    public static ArrayList<EmployeeVo> selectEmp(){
        ArrayList<EmployeeVo> emps = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        conn = EmployeeJDBC.makeConn();
        try{
            pstmt = conn.prepareStatement(EmployeeJDBC.selectEmp);
            rs = pstmt.executeQuery();
            while (rs.next()){
                EmployeeVo e = new EmployeeVo(
                        rs.getInt(1), //empno
                        rs.getString(2),//lanme
                        rs.getString(3),//email
                        rs.getString(4),//jobid
                        rs.getInt(5),//mgrid
                        rs.getInt(6));//deptid
                emps.add(e);
            }
        }catch (SQLException se){
            System.out.println("selectEmp에서 오류 발생");
            se.printStackTrace();
        }
        EmployeeJDBC.destoryConn(conn,pstmt,rs);

        return emps;
    }

    // 입력받은 사원번호로 employees 테이블에서 조회하고
    // 그 결과를 EmployeesVo로 구성 한 후 EmployeeV3Service로 넘김
    public static EmployeeVo selectOneEmp(String empid) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        EmployeeVo emp = null;

        conn = EmployeeJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(EmployeeJDBC.selectOneEmp);
            pstmt.setString(1,empid);
            rs = pstmt.executeQuery();
            if(rs.next()){
                emp = new EmployeeVo(rs.getInt(1),rs.getString(2),
                        rs.getString(3),rs.getString(3),
                        rs.getString(5),rs.getString(6),
                        rs.getString(7),rs.getInt(8),
                        rs.getDouble(9),rs.getInt(10),
                        rs.getInt(11));
            }
        } catch (SQLException se) {
            System.out.println("selectOneEmp에서 오류발생");
            se.printStackTrace();
        }
        EmployeeJDBC.destoryConn(conn,pstmt,rs);

        return emp;
    }

    //입력받은 사원정보를 employees 테이블에 저장함
    public static String insertEmp(EmployeeVo emp) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String result = "사원데이터 처리중.....";

        conn = EmployeeJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(EmployeeJDBC.insertEMP);
            pstmt.setInt(1,emp.getEmpno());
            pstmt.setString(2,emp.getFname());
            pstmt.setString(3,emp.getLname());
            pstmt.setString(4,emp.getEmail());
            pstmt.setString(5,emp.getPhone());
            pstmt.setString(6,emp.getHdate());
            pstmt.setString(7,emp.getJobid());
            pstmt.setInt(8,emp.getSal());
            pstmt.setDouble(9,emp.getComm());
            pstmt.setInt(10,emp.getMgrid());
            pstmt.setInt(11,emp.getDeptid());

            int cnt = pstmt.executeUpdate();
            if (cnt>0) result = "사원정보 추가완료";
        } catch (SQLException se) {
            System.out.println("insertEmp에서 오류 발생");
            se.printStackTrace();
        }

        return result;
    }

    public static String deleteEmp(int empid) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String result = "사원정보 삭제처리중....";

        conn = EmployeeJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(EmployeeJDBC.delectEMP);
            pstmt.setInt(1, empid);
            int cnt = pstmt.executeUpdate();
            if (cnt>0) result = "사원정보 삭제완료";
        } catch (SQLException se) {
            System.out.println("delectEMP에서 오류 발생");
            se.printStackTrace();
        }
        EmployeeJDBC.destoryConn(conn,pstmt);

        return result;
    }

    //수정할 사원 정보를 넘겨받아
    public static String updateEmp(EmployeeVo emp){
        Connection conn = null;
        PreparedStatement pstmt = null;
        String result = "사원정보 수정중.....";

        conn = EmployeeJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(EmployeeJDBC.updateEMP);
            pstmt.setString(1, emp.getFname());
            pstmt.setString(2, emp.getLname());
            pstmt.setString(3, emp.getEmail());
            pstmt.setString(4, emp.getPhone());
            pstmt.setString(5, emp.getHdate());
            pstmt.setInt(6, emp.getEmpno());
            int cnt = pstmt.executeUpdate();
            if (cnt>0) result = "사원정보 수정완료";
        } catch (SQLException se) {
            System.out.println("updateEMP에서 오류 발생");
            se.printStackTrace();
        }
        EmployeeJDBC.destoryConn(conn,pstmt);

        return result;
    }
}
