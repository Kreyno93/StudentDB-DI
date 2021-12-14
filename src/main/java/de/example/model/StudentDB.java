package de.example.model;
import lombok.Data;
import lombok.NonNull;

@Data
public class StudentDB {
    @NonNull public Student[] studentArray;
}
