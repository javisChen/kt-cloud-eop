package com.kt.cloud.eop.api.codeproject.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodeProjectListVO {

    private Long id;

    private String name;

    private String code;

    private String description;

    private String type;

    private String scaffold;

    private String gitHtmlUrl;

    private String gitHttpsUrl;

    private String gitSshUrl;

    private String reposStatus;

    private String pushStatus;

    private LocalDateTime createTime;

}
