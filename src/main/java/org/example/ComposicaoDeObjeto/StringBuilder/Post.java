package org.example.ComposicaoDeObjeto.StringBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    // Construtor sem parâmetros
    public Post() {
    }

    // Construtor com parâmetros
    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    // Getters
    public Date getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Integer getLikes() {
        return likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // Setters
    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    // Método para adicionar um comentário
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    // Método para remover um comentário
    public void removeComment(Comment comment) {
        comments.remove(comment); // Corrigido para remover o comentário passado como argumento
    }

    // Método para listar todos os comentários
    public void listComments() {
        System.out.println("Comentários:");
        for (Comment comment : comments) {
            System.out.println(comment.getText());
        }
    }
}
