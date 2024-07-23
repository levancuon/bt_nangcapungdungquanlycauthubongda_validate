package org.example.bt_nangcapungdungquanlycauthubongda_validate.model;

import jakarta.persistence.*;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.sql.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Tên không được để trống")
    @Pattern(regexp = "[a-zA-Z0-9]*",message = "Ko được chứa ký tự đặc biệt")
    @Size(min = 5, max = 100 , message = "Độ dài từ 5-100 ký tự")
    private String name;

    private Date dob;
    @Range(min = 0,message = "Kinh nghiệp phải là số nguyên dương")
    private String experience;
    @NotBlank(message = "Không được để trống vị trí")
    private String position;
    @ManyToOne
    @JoinColumn(name = "club_id")
    private Club club;



}
