/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitcamp.newdeal.lms;
import java.sql.Date;
import java.util.Scanner;



public class App {


  public static void main(String[] args) {


    /*  목록으로 출력할 항목은 번호,수업명,시작일~종료일,총수업시간이다.  
     *      계속 입력하시겠습니까?(Y/n) n

        1, 자바 프로젝트 실습     , 2019-01-02 ~ 2019-05-28, 1000
        2, 자바 프로그래밍 기초    , 2019-02-01 ~ 2019-02-28,  160
        3, 자바 프로그래밍 고급    , 2019-03-02 ~ 2019-03-30,  160*/
    final int DEFAULT_SIZE = 1;


    int[] no = new int[DEFAULT_SIZE] ;    
    String [] name = new String[DEFAULT_SIZE];
    String [] email = new String[DEFAULT_SIZE];
    int [] encliment = new int[DEFAULT_SIZE];
    String [] photo = new String[DEFAULT_SIZE];
    String [] phone = new String[DEFAULT_SIZE];
    Date[] startDate = new Date[DEFAULT_SIZE];  

    int len = 0 ;

    Scanner keyIn = new Scanner(System.in);

    for(int i =0 ; i <DEFAULT_SIZE ; i++ ) {

      System.out.print("번호?");
      no[i] = keyIn.nextInt();

      System.out.print("이름?");
      name[i] = keyIn.nextLine();
      

      System.out.print("이메일?");
      email[i] = keyIn.nextLine();

      System.out.print("암호?");
      encliment[i] = keyIn.nextInt();
      
      System.out.print("사진?");
      photo[i] = keyIn.nextLine();
      
      System.out.print("전화번호");
      phone [i] = keyIn.nextLine();
          
      System.out.print("가입일?");
      startDate[i] = Date.valueOf(keyIn.nextLine());

      System.out.printf("%d, %s %s ~ %s, %d \n", 
          no[i],  name[i], email[i], encliment[i],  photo[i], phone[i], startDate[i]
          );
     
    
    }

    keyIn.close();

   


  

  }
}
