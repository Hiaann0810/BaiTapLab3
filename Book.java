package lab3;

import java.util.Scanner;

public class Book {
        public String boCode;
        public String boTitle;
        public String boAuthor;
        public Book(){
//            this.boCode=0;
//            this.boTitle=0;
//            this.boAuthor=0;
        }
        public Book(String boCode, String boTitle, String boAuthor){
            this.boCode=boCode;
            this.boTitle=boTitle;
            this.boAuthor=boAuthor;
        }
        public Book(Book bo){
            System.out.println("Hay Nhap code");
            boCode= scanner.next();
            System.out.printf("Hay Nhap Title");
            boTitle=scanner.next();
            System.out.printf("Hay Nhap");
            boAuthor=scanner.next();            
        }
        public String getboCode(){
           return this.boCode;
        }
        public String getBoTitle(){
            return this.boTitle;
        }
        public String getBoAuthor(){
            return this.boAuthor;
        }

}
