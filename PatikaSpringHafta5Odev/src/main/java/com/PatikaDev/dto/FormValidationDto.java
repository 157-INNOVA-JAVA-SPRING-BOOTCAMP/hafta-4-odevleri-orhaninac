package com.PatikaDev.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.*;
import java.util.Date;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

// NEMM :  @NotEmpty @Email @Min @Max @Size
public class FormValidationDto {

    @NotEmpty(message = "adı alanını boş geçemezsiniz")
    private String userName;

    @NotEmpty(message = "soyadı alanını boş geçemezsiniz")
    private String userSurname;

    @NotEmpty(message = "email alanını boş geçemezsiniz")
    @Email(message = "uygun formatta mail giriniz")
    private String emailAddress;

    @NotEmpty(message = "email alanını boş geçemezsiniz")
    private String phoneNumber;

   // @NotEmpty(message = "tarih alanını boş geçemezsiniz")
    private String date;
}
