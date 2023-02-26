package aop;

import org.springframework.stereotype.Component;

@Component   //default id "uniLibrary"
public class UniLibrary extends AbstractLibrary{


    public void getBook(){

        System.out.println("we take the book from university: ");
    }

//    public void getBook(Book bookName){
//
//        System.out.println("we take the book from university: " + bookName.getName());
//    }

    public String returnBook(){
//        int s = 10/0;
        System.out.println("we return book at university");
        return "War and Peace.";
    }

    public void getMagazine(){
        System.out.println("we take the magazine from university");
        System.out.println("------------------------------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("we return magazine at university");
        System.out.println("------------------------------------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println(" we add book at university");
        System.out.println("------------------------------------------------------------");
    }

    public void addMagazine(){
        System.out.println("------------------------------------------------------------");
    }

}
