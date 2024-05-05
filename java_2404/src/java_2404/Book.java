package java_2404;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int remainAcount;

    //수량을 입력하지 않으면 자동으로 10개가 저장된다. 
    Book (String title) {
        this(title,"작자미상",10);
    }
    Book(String title, int remainAcount) {
        this(title,"작자미상",remainAcount);
    }
    Book(String title, String author,int remainAcount) {
        this.title = title;
        this.author = author;
        this.remainAcount = remainAcount;
    }

    public void getBook () {
        System.out.println("이름 : "+title);
        System.out.println("작가 : "+author);
        System.out.println("남은 수량 : "+remainAcount);
    }

    //작가 바꾸는 메소드
    public void setAuthor(String author) {
        this.author = author;
    }
    //수량 변경 메소드
    //수량 0이하면 작동 안함
    public void setRemainAcount(int remainAcount) {
        if (remainAcount<1) {System.out.println("수량을 입력하세요!!"); return;}
        this.remainAcount = remainAcount;
    }

    public int sellBook (int number) {

        if (number<1) {System.out.println("판매한 수량을 입력하세요!");} 
        else if (number>remainAcount) {System.out.println("잔여 수량보다 낮은 숫자를 입력하세요!");}
        else if (remainAcount==number) {remainAcount -= number; System.out.println("책이 완판 되었습니다!!");}
        else {remainAcount-=number;}
        System.out.println(title+"의 잔여수량은 "+remainAcount+"입니다!");
        return remainAcount;
        
    }
}



class Test {
    public static void main(String[] args) {
        Book book1 = new Book("콩쥐 팥쥐");
        Book book2 = new Book("고딩 엄빠는 답이 없다.",5);
        Book book3 = new Book("Inside Out","김교진",8);
        Book book4 = new Book("java는 쉽다","소이현",4);

       
        book1.getBook();
        book2.getBook();
        book3.getBook();
        book4.getBook();



        book1.setRemainAcount(20);
        book1.getBook();

        book1.sellBook(18);

    }

}