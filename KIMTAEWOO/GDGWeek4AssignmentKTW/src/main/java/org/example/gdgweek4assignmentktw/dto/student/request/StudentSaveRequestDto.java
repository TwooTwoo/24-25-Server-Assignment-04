package org.example.gdgweek4assignmentktw.dto.student.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.gdgweek4assignmentktw.domain.Student;

import java.util.Date;

@Getter
@NoArgsConstructor
public class StudentSaveRequestDto {
    private Long studentNumber;
    private String studentFaculty;
    private String studentName;
    private Date studentBirthday;
    private String studentPhonenumber;

    public Student toEntity() {
        return Student.builder()
                .studentNumber(this.studentNumber)
                .studentFaculty(this.studentFaculty)
                .studentName(this.studentName)
                .studentBirthday(this.studentBirthday)
                .studentPhonenumber(this.studentPhonenumber)
                .build();
    }
}