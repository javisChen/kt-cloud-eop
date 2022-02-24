package com.kt.cloud.eop.manager.git;

import lombok.Data;

@Data
public class GitCreateReposResponse {

    private String htmlUrl;
    private String sshUrl;
    private String cloneUrl;
    private String name;

}
