package com.example.swaggerdemo.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.swaggerdemo.vo.EditVO;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping()
@Tag(name = "FUNCTION01")
public class DemoController {

	@Operation(summary = "這是一個GET請求範例", description = "測試GET ...", responses = { @ApiResponse(responseCode = "200", description = "成功"), @ApiResponse(responseCode = "404", description = "找不到路徑") }, parameters = { @Parameter(name = "oid", description = "參數1") }, externalDocs = @ExternalDocumentation(url = "https://xxx/README.md"))
	@GetMapping(value = "testget")
	public String get(@RequestParam String oid) {
		return LocalDateTime.now() + " oid: " + oid;
	}

	@Operation(summary = "這是一個Post請求範例", description = "測試Post ...", responses = { @ApiResponse(responseCode = "200", description = "成功", content = @Content(mediaType = "application/json")), @ApiResponse(responseCode = "404", description = "找不到路徑") }, externalDocs = @ExternalDocumentation(url = "https://xxxooo/README.md"))
	@PostMapping(value = "testpost")
	public String post(@RequestBody EditVO vo) {

		return LocalDateTime.now() + " oid: " + vo.getOid();
	}

}
