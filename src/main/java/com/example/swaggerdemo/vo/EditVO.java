package com.example.swaggerdemo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "輸入物件")
public class EditVO {

    @Schema(name = "oid",example = "SEANTEST001", description = "OID 代碼", required = true)
    private String oid;

}
