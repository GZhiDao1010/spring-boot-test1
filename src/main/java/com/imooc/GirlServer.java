package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlServer {
    @Autowired
    private GirlRepository girlRepository;

    /**
     *  加上@Transactional注解时，A不能保存时，B同样不能保存，否则A不能保存，B能保存到数据库
     */
    @Transactional
    public void inserTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }
}
