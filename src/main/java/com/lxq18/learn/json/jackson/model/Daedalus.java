package com.lxq18.learn.json.jackson.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * @author lixiaoqiang
 * @create 2020/7/19 17:10
 */
@Getter
@Setter
public class Daedalus extends Equipment {
    private String name;
    private String weight;
    private int damage;
    private List<String> roles;
    private Map<String, String> origin;
}
