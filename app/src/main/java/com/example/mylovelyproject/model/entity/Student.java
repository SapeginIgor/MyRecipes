package com.example.mylovelyproject.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Entity(tableName = "students")
public class Student {

    @PrimaryKey(autoGenerate = true)
    @Getter @Setter
    private Long id;

    @ColumnInfo(name = "firstname")
    @Getter @Setter
    private String firstname;

    @ColumnInfo(name = "lastname")
    @Getter @Setter
    private String lastname;

    @ColumnInfo(name = "patronymic")
    @Getter @Setter
    private String patronymic; // null

    @ColumnInfo(name = "dateofbirth")
    @Getter @Setter
    private String dateofbirth;

    @ColumnInfo(name = "group_id")
    @Getter @Setter
    private Long groupId;



}
