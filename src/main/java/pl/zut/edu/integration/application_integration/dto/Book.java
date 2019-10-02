package pl.zut.edu.integration.application_integration.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {

    private String id;
    private String title;
    private String author;
    private String isbn;
    private Integer year;
}
