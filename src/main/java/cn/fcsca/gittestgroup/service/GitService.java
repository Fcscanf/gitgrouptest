package cn.fcsca.gittestgroup.service;

import cn.fcsca.gittestgroup.dao.GitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * GitService
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:17 2018-09-06
 */
@Service
public class GitService {

    @Autowired
    GitDao gitDao;
}
