package ru.netology;

public class Post {
    private LikesInfo likesInfo;        // Дополнительный класс отвечающий за лайки
    private RepostsInfo repostsInfo;    // Дополнительный класс отвечающий за репосты
    private CommentsInfo commentsInfo;  // Дополнительный класс отвечающий за комментарии
    private int id;                     // Идентификационный номер поста
    private String text;                // Текст поста
    private int date;                   // Дата публикации
    private int numberOfViews;          // Количество просмотров
    private String imgUrl;              // Расположение картинки
    private int signerId;               // Идентификатор автора,если публикация была от имени сообщества и подписана пользователем
    private boolean markedAsAds;        // Присутствует ли реклама
    private int ownerId;                // Идентификатор владельца стены
}