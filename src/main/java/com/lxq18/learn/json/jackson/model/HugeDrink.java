package com.lxq18.learn.json.jackson.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lixiaoqiang
 * @create 2020/7/19 17:11
 */
@Getter
@Setter
public class HugeDrink extends Equipment {
    private String name;
    private int capacity;
    private String effect;
}