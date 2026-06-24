class User{
    private String UserID;
    private String UserName;

    public User(String UserID,String UserName){
        this.UserID = UserID;
        this.UserName = UserName;
    }

    public String getUserID() {

        return UserID;
    }
    public String getUserName(){

        return UserName;
    }
}

class student extends User{
    int bookcount = 0;

    public student(String UserID, String UserName) {
        super(UserID, UserName);
    }

    public void borrowbooks(Books books ){
        if (bookcount<3){
            System.out.println(getUserName()+" "+books.getBookname()+" "+ "Borrwed");
            bookcount++;
        }else{
            System.out.println("Limit Exceeds");
        }
    }

}

class Books{
    private String Bookname;
    private String BookId;

    public Books(String Bookname,String BookId){
        this.Bookname=Bookname;
        this.BookId=BookId;
    }

    public String getBookname(){

        return Bookname;
    }

    public String getBookId(){

        return BookId;
    }
}

public class LibraryManagement {
    public static void main(String args[]){
        Books B1 = new Books("Java","B23");
        Books B2 = new Books("Pyhton","C34");
        Books B3 = new Books("Maths","C44");
        Books B4 = new Books("Stat","C56");

        student S1 = new student("s234","John");

        S1.borrowbooks(B1);
        S1.borrowbooks(B2);
        S1.borrowbooks(B3);
        S1.borrowbooks(B4);



    }
}