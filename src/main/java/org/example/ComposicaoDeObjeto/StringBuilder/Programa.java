package org.example.ComposicaoDeObjeto.StringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Programa {

    public static void main(String[] args) {
        // Formato da data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Criar alguns comentários
        Comment c1 = new Comment("Fazer boa viagem");
        Comment c2 = new Comment("Uau, isso é incrível");

        // Criar uma data para o post
        Date moment = null;
        try {
            moment = sdf.parse("03/11/2024 10:00:00"); // Exemplo de data
        } catch (ParseException e) {
            System.out.println("Erro ao formatar a data: " + e.getMessage());
        }

        // Criar um post
        String title = "Minha Viagem";
        String content = "Estou indo para a praia!";
        Integer likes = 10; // Exemplo de número de likes

        Post p1 = new Post(moment, title, content, likes);

        // Adicionar comentários ao post
        p1.addComment(c1);
        p1.addComment(c2);

        // Exibir informações do post
        System.out.println("Título: " + p1.getTitle());
        System.out.println("Conteúdo: " + p1.getContent());
        System.out.println("Data: " + sdf.format(p1.getMoment()));
        System.out.println("Likes: " + p1.getLikes());

        // Listar comentários
        p1.listComments();
    }
}
