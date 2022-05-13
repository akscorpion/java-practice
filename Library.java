import java.util.*;

class Library
{
    String bookName;
    String author;
    Library()
    {
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
    public HashMap<Integer,Library> createLibraryMap(String booksInLibrary)
    {
        HashMap<Integer,Library> libraryMap = new HashMap<>();
        String[] a = booksInLibrary.split("\\|");
        for (String b : a) {
            String[] c = b.split(",");
            Library ob = new Library(c[1], c[2]);
            libraryMap.put(Integer.parseInt(c[0]), ob);
        }
        return libraryMap;
    }
    public HashMap<Integer,Integer> createUserMap(String borrowedUsers)
    {
        HashMap<Integer,Integer> userMap = new HashMap<>();
        String[] a = borrowedUsers.split("\\|");
        for(String b:a){
            String[] c = b.split(",");
            userMap.put(Integer.parseInt(c[0]), Integer.parseInt(c[1]));
        }
        return userMap;
    }
    public String getQuery(String booksInLibrary,String borrowedUsers,String query)
    {
        String[] s = query.split(",");
        String output = "";
        int q = Integer.parseInt(s[0]);
        if (q > 0){
            switch (q){
                case 1: output = query1(booksInLibrary, borrowedUsers, Integer.parseInt(s[1]));
                    break;
                case 2: output = query2(booksInLibrary, borrowedUsers, Integer.parseInt(s[1]));
                    break;
                case 3: output = query3(booksInLibrary, borrowedUsers, s[1]);
                    break;
                case 4: output = query4(booksInLibrary, s[1]);
                    break;
                case 5: output = query5(booksInLibrary, s[1]);
                    break;
            }
        }
        return output;
    }
    private String query1(String booksInLibrary, String borrowedUsers, int bookId) {
        //(book id : object of Library class<book name & book author>)
        HashMap<Integer, Library> libMap = createLibraryMap(booksInLibrary);
        //(book id : user id)
        HashMap<Integer, Integer> useMap = createUserMap(borrowedUsers);
        String out;
        if (useMap.containsKey(bookId)){
            int userId = useMap.get(bookId);
            out = "No Stock\nIt is owned by "+userId+"\n";
        }else {
            Library ob = libMap.get(bookId);
            String a = ob.author;
            out = "It is available\nAuthor is "+a+"\n";
        }
        return out;
    }
    private String query2(String booksInLibrary, String borrowedUsers, int userId) {
        HashMap<Integer, Library> libMap = createLibraryMap(booksInLibrary);//(book id : object of Library class<book name & book author>)
        HashMap<Integer, Integer> useMap = createUserMap(borrowedUsers); //(book id : user id)
        StringBuilder out = new StringBuilder();
        List<Integer> bookId = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: useMap.entrySet()) {
            if (userId == entry.getValue()){
                bookId.add(entry.getKey());
            }
        }
        for (Integer entry: bookId) {
            Library ob = libMap.get(entry);
            String bookName = ob.bookName;
            out.append(entry).append(" ").append(bookName).append("\n");
        }
        return out.toString();
    }
    private String query3(String booksInLibrary, String borrowedUsers, String bookName) {
        HashMap<Integer, Library> libMap = createLibraryMap(booksInLibrary);
        HashMap<Integer, Integer> useMap = createUserMap(borrowedUsers);
        List<Integer> bookId = new ArrayList<>();
        String out;
        for(Map.Entry<Integer, Library> entry: libMap.entrySet()){
            Library ob = entry.getValue();
            String a = ob.bookName;
            if (a.equals(bookName)){
                bookId.add(entry.getKey());
            }
        }
        int in=0;
        int ou=0;
        for (Integer x : bookId) {
            if (useMap.containsKey(x)){
                ou++;
            }else {
                in++;
            }
        }
        out = ""+ou+" out\n"+in+" in\n";
        return out;
    }
    private String query4(String booksInLibrary, String authorName) {
        HashMap<Integer, Library> libMap = createLibraryMap(booksInLibrary);
        StringBuilder out = new StringBuilder();
        for(Map.Entry<Integer, Library> entry: libMap.entrySet()) {
            Library ob = entry.getValue();
            String a = ob.author;
            if (a.equals(authorName)){
                out.append(ob.bookName).append("\n");
            }
        }
        return out.toString();
    }
    private String query5(String booksInLibrary, String search) {
        HashMap<Integer, Library> libMap = createLibraryMap(booksInLibrary);
        StringBuilder out = new StringBuilder();
        for(Map.Entry<Integer, Library> entry: libMap.entrySet()) {
            Library ob = entry.getValue();
            String bookName = ob.bookName;
            int bookId = entry.getKey();
            if (bookName.toLowerCase().contains(search.toLowerCase())){
                out.append(bookId).append(" ").append(bookName).append("\n");
            }
        }
        return out.toString();
    }

    public static void main(String[] args) {
        Library ob = new Library();
        String query = ob.getQuery("1001,Adventures of Sherlock Holmes,Sir Arthur Conan Doyle|1002,Adventures of Tom Sawyer,The Mark Twain|1003,Alice in the Wonderland,Lewis Carroll|1004,All’s Well that Ends well,William Shakespeare|1005,As you like it,William Shakespeare|1006,Anand Math,Bankim Chandra Chatterjee","1006,101|1003,102|1001,101","1,1005");
        System.out.println(query);
    }
}

