package com.kt.cloud.codeproject.manager.git.gitee.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class GiteeCreateReposRequest extends GiteeBaseRequest {

    private String name;
    private String description;
}