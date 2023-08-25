package ObjectsAndClasses.Exercise.Articles;

import java.util.ArrayList;
import java.util.Collections;

public class Article {

    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;

    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setContent(String newContent) {
        this.content = newContent;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void Edit (String content) {
        setContent(content);
    }

    public void ChangeAuthor(String author){
        setAuthor(author);
    }

    public void Rename (String title) {
        setTitle(title);
    }

    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
                //"{title} - {content}: {author}"
    }
}
