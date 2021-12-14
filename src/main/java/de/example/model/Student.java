package de.example.model;
import lombok.Data;
import lombok.NonNull;

@Data
public class Student {
    @NonNull String name;
    @NonNull int id;

}
