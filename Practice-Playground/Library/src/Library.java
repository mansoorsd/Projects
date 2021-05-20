import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Library
{

    String bookName;
    String author;
    Library(){

    }
//    Map<Integer,Library> library = new HashMap<>();
//    Library(HashMap<Integer,Library> library){
//        this.library = library;
//
//    }


    public String getAuthor() {
        return author;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.bookName);
        hash = 83 * hash + Objects.hashCode(this.author);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Library other = (Library) obj;
        if (!Objects.equals(this.bookName, other.bookName)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
    }


    Library(String bookName,String author)
    {
        this.bookName=bookName;
        this.author=author;
    }

    public String getBookName() {
        return bookName;
    }

    public HashMap<Integer,Library> createLibraryMap(String booksInLibrary)
    {


        HashMap<Integer,Library> lib = new HashMap<>();
        String[] booksData = booksInLibrary.split("[|]");

        for (String books : booksData) {
            String[] oneBook = books.split(",");
            int id = Integer.parseInt(oneBook[0]);
            String bookName = oneBook[1];
            String author = oneBook[2];

            Library booksOnly = new Library(bookName, author);
           lib.put(id,booksOnly);
        }
        return  lib;

    }
    public HashMap<Integer,Integer> createUserMap(String borrowedUsers) {
        HashMap<Integer, Integer> usersList = new HashMap<>();
        String[] booksData = borrowedUsers.split("[|]");
        for (String books : booksData) {

            String[] oneUser = books.split(",");
            int id = Integer.parseInt(oneUser[1]);
            int bookId = Integer.parseInt(oneUser[0]);
            usersList.put(bookId,id);

        }
        return usersList;
    }


    public String getQuery(String booksInLibrary,String borrowedUsers,String query)
    {

        HashMap<Integer, Library> lib = new HashMap<>(createLibraryMap(booksInLibrary));
        HashMap<Integer,Integer>  users = new HashMap<>(createUserMap(borrowedUsers));
        String[] dataquery = query.split(",");


        int qry = Integer.parseInt(dataquery[0]);
        if(qry ==1){
            int bookid = Integer.parseInt(dataquery[1]);
            if(users.containsKey(bookid)) {
                int g = users.get(bookid);
                        String outString = "No Stock\nIt is owned by "+ g+"\n";
                       return outString;
                    }

            else {

                  String bookauthor =lib.get(bookid).getAuthor();

                return  "It is available"+"\n"+"Author is " +bookauthor+"\n";

            }
        }
        if(qry==2){
            int userid =  Integer.parseInt(dataquery[1]);
          String books="";
            for (Map.Entry<Integer, Integer> entry : users.entrySet()){
                if(entry.getValue()==userid){
                    int a = entry.getKey();
                    books = books+a +" "+lib.get(a).getBookName();
                    books = books+"\n";

                }

            }
            return books;
        }

        if(qry==3){
            String bookName = (dataquery[1]);
            int count =0;
            int reg =0;

            for (Map.Entry<Integer,Library> entry : lib.entrySet()){
                if(entry.getValue().getBookName().equals(bookName)){
                    count++;
                    if (users.containsKey(entry.getKey())){
                        count--;
                        reg++;
                    }
                }
            }

            return reg+" out"+"\n"+ count+" in\n";

        }
        if(qry==4){
            String author = (dataquery[1]);
            String output ="";



            for (Map.Entry<Integer,Library> entry : lib.entrySet()){
                if(entry.getValue().getAuthor().equals(author)){
                    output = output +entry.getValue().getBookName() +"\n";

                }
            }
            return output;

        }
        if (qry==5){
            String keyword = dataquery[1];
                    String output = "";
            for (Map.Entry<Integer,Library> entry : lib.entrySet()){
                String a = entry.getValue().getBookName();
                if(a.toLowerCase().contains(keyword.toLowerCase())){

                    output = output +entry.getKey() +" "+entry.getValue().getBookName()+"\n";

                }
            }
            return output;

        }
        return null;
    }

}

