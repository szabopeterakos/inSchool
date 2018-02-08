package attributes02.book;

public class book {

    String title;

    public book(String title) {
        this.title = title;
    }

    //    public book(String title){
//        this.title = title;
//    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

}

class BookMain{
    public static void main(String[] args) {
        book bk = new book("Game Of Thrones");
        bk.setTitle("Game Of Chickens");
        System.out.println(bk.getTitle());
    }

}
