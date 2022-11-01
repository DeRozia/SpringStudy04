package service.impl;

import service.IAccountService;

import java.util.*;

/**
 * 账户的业务层实现类
 */

public class AccountServiceImpl3 implements IAccountService {

    //经常变动的数据，不适用注入的方式

    private String[] myStrs;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myPros;

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyPros(Properties myPros) {
        this.myPros = myPros;
    }

    public void saveAccount() {
        System.out.println(Arrays.toString(myStrs));
        System.out.println(myList);
        System.out.println(myMap);
        System.out.println(myPros);
        System.out.println(mySet);

    }


}
