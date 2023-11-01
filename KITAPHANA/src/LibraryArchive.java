import java.util.ArrayList;

public class LibraryArchive {
    ArrayList<String>  Archival = new ArrayList<>();

    public void AddToArchive(String product){
        Archival.add(product);
    }
    public String reedRating(int id){
        return Archival.get(id);
    }
}


