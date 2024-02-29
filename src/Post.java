
import java.time.LocalDate;
import java.util.ArrayList;


public class Post {
    private int postID;
    private String title;
    private LocalDate creationDate;
    ArrayList<ResearchPaper> rPaperList;

    public Post(int id, String title, ArrayList<ResearchPaper> rPaperList) {
        this.postID=id;
        this.title=title;
        this.rPaperList=rPaperList;
        creationDate=LocalDate.now();
    }
    
    public int getpostId()
    {
        return this.postID;
    }
    
    public String getTile()
    {
        return this.title;
    }
    
    public ArrayList<ResearchPaper> getResearchPaper()
    {
        return this.rPaperList;
    }
    
    public LocalDate getDate()
    {
        return this.creationDate;
    }
    
    public boolean editPost(String title, ArrayList<ResearchPaper> rPaperList)
    {
        
        if(this.title.equals(title) && this.rPaperList.equals(rPaperList))
        {
            return false;
        }
        
        this.title=title;
        this.rPaperList=rPaperList;
        
        return true;
    }
    
}
