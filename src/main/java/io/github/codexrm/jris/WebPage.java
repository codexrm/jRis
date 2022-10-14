package io.github.codexrm.jris;

import java.time.LocalDate;
import java.util.ArrayList;

public class WebPage extends BaseReference  {

    private final ArrayList<String> authorList;
    private String title;
    private LocalDate date;
    private LocalDate accessDate;
    private String url;

    public WebPage() {
        super();
        authorList = new ArrayList<>();
    }

    public ArrayList<String> getAuthorList() { return authorList; }

    public String getTitle() { return title; }

    public void setTitle(final String title) { this.title = title; }

    public LocalDate getDate() { return date; }

    public void setDate(final LocalDate date) { this.date = date; }

    public LocalDate getAccessDate() { return accessDate; }

    public void setAccessDate(final LocalDate accessDate) { this.accessDate = accessDate; }

    public String getUrl() { return url; }

    public void setUrl(final String url) { this.url = url; }
}
