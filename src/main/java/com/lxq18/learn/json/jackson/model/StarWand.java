package com.lxq18.learn.json.jackson.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lixiaoqiang
 * @create 2020/7/19 17:09
 */
@Getter
@Setter
public class StarWand extends Equipment {
    private String name;
    private int length;
    private int price;
    private List<String> effect;
}
