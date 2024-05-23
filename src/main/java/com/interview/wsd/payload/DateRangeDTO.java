package com.interview.wsd.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public class DateRangeDTO {
    @NotBlank
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date orderDateFrom;

    @NotBlank
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date orderDateTo;
}
