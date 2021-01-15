package JSB.emp;
/*
*사번 empno
이름 fname
이름2 lname
이메일 email
전화번호 phone
입사일 hdate
아이디 jobid
급여 sal
매니저 아이디 mgrid
부서번호 deptid
* 수당 comm
* */

public class EmployeeVo {
    private int empno; //사번
    private String fname; //성
    private String email; //이메일
    private String jobid; //직책
    private int mgrid;//매니저 아이디
    private int deptid; //부서번호

    private String lname; //이름
    private String phone; //전화번호
    private String hdate; //날짜
    private int sal;//급여
    private double comm; //수당

    //매개변수
    public EmployeeVo(int empno, String fname, String lname, String email, String phone, String hdate,
                      String jobid, int sal, double comm, int mgrid, int deptid) {
        this.empno = empno;
        this.fname = fname;
        this.email = email;
        this.jobid = jobid;
        this.mgrid = mgrid;
        this.deptid = deptid;
        this.lname = lname;
        this.phone = phone;
        this.hdate = hdate;
        this.sal = sal;
        this.comm = comm;
    }

    public EmployeeVo(int empno, String lname, String email, String jobid, int mgrid, int deptid) {
        this.empno = empno;
        this.lname = lname;
        this.email = email;
        this.jobid = jobid;
        this.mgrid = mgrid;
        this.deptid = deptid;
    }

    public EmployeeVo(int empno, String fname, String lname, String email, String phone, String hdate) {
        this.empno = empno;
        this.fname = fname;
        this.email = email;
        this.lname = lname;
        this.phone = phone;
        this.hdate = hdate;
    }

    public EmployeeVo() { }

    //getter/setter

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getMgrid() {
        return mgrid;
    }

    public void setMgrid(int mgrid) {
        this.mgrid = mgrid;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHdate() {
        return hdate;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }
}
