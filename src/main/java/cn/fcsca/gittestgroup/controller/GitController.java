package cn.fcsca.gittestgroup.controller;

import cn.fcsca.gittestgroup.service.GitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * GitController
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:08 2018-09-06
 */
@RestController
public class GitController {

    @Autowired
    GitService gitService;
}
