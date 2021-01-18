package JSB.data;

import JSB.data.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring4DataApp01 {
    //스프링4 data를 이용한 프로젝트
    //기존 JDBC API 이용시 문제점
    //JDBC는 데이터 베이스에 접근하기 위한 자바 표준 API
    //하지만 JDBC표준 API를 사용하면서 발생하는 문제는
    //1)Connection/PrepareDtatement/ReseultSet 객체 관리
    //2)복잡한 예외/SQLException 처리문제 - 원인 파악 모호
    //3)DriverManager/JNDI를 이용한 Connection 객체 취득 문제

    //하지만 스프링 프레임워크의 JDBC기능을 이용하려면 위 문제 대부분이 해결

    //persistence API
    //JDBC : 자바 표준 API
    //Hivernate : ORM 기반 persistence API
    //JPA : J2EE 표준 API hibernate를 기반으로 제작
    //myBatis : SQL Mapping 기반 persistence API

    //필요 라이브러리
    //spring-jdbc

    //회원정보를 다루는 프로그램 : CRUD
    //App -> MemberService -> MemberDAO
    //          (MemberVO)
   public static void main(String[] args) {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("spring4data01.xml");

       MemberService msrv = (MemberService) ctx.getBean("msrv");

       //회원정보 생성
       System.out.println(msrv.newMember());

       //회원정보 조회 (아이디, 등급, 가입일)
       System.out.println(msrv.readMember());

       //회원정보 상세 조회(아이디로 검색, 모든 컬럼 출력)
       System.out.println(msrv.readOneMember());

       //회원정보 수정
       System.out.println(msrv.modifyMember());

       //회원정보 삭제
       System.out.println(msrv.removeMember());
   }
}
