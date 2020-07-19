package com.lxq18.learn.json.jackson.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lixiaoqiang
 * @create 2020/7/19 17:08
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "name",
        visible = true)
@JsonSubTypes(value = {
        @JsonSubTypes.Type(value = Daedalus.class, name = "Daedalus"),
        @JsonSubTypes.Type(value = HugeDrink.class, name = "Huge drink"),
        @JsonSubTypes.Type(value = StarWand.class, name = "Star wand"),
})
@Getter
@Setter
public class Equipment {
    private String superName;
}
