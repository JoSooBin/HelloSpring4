package JSB.sungjuk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * 파일명 : SungJukV10Main
 * 작성일 : 2021.01.15
 *
 * 프로그램 설명 : 성적처리프로그램 v10
 * 성적처리 프로그램에 저장기능을 추가함
 * 즉, mariadb 데이터베이스에
 * sungjuk테이블을 생성해서
 * 입력한 성적데이터를 저장해 둠
 *
 */
public class SungJukV11Main {
    public static void main(String[] args) {
        //SungJukV11Service sjsrv = new SungJukJukV11ServiceImpl();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("sungjuk.xml");
        SungJukV11Service sjsrv = (SungJukJukV11ServiceImpl)ctx.getBean("sjsrv");

        Scanner sc = new Scanner(System.in);
        String menu = "";

        while(true) { // 메뉴 띄우고 작업번호 입력을 반복
            ((SungJukUI)sjsrv).displayMenu();
            menu = sc.nextLine();

            switch(menu) {
                case "1": sjsrv.newSungJuk(); break;
                case "2": sjsrv.readSungJuk(); break;
                case "3": sjsrv.readOneSungJuk(); break;
                case "4": sjsrv.modifySungJuk(); break;
                case "5": sjsrv.removeSungJuk(); break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("잘못입력!!");
            }
        }
    }
}
