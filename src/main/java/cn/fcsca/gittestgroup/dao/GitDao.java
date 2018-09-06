package cn.fcsca.gittestgroup.dao;

import cn.fcsca.gittestgroup.service.GitService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * GitDao
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:27 2018-09-06
 */
public class GitDao {

    @Autowired
    GitService gitService;
}
