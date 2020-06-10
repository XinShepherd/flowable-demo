package io.github.xinshepherd.flowable.data;

/**
 * @author Fuxin
 * @since 2020/6/10
 */
public class Article {
    String taskId;
    String author;
    String url;

    public Article(String taskId, String author, String url) {
        this.taskId = taskId;
        this.author = author;
        this.url = url;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
