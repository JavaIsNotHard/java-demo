package com.jibeshshrestha.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    private Integer id;
    @Column(name = "stu_name", length=200, nullable = false)
    private String name;
    @Column(name = "stu_addr", length=200, nullable = false)
    private String address;
}