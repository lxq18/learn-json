package com.lxq18.learn.json.jackson;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.lxq18.learn.json.jackson.model.Daedalus;
import com.lxq18.learn.json.jackson.model.Equipment;
import com.lxq18.learn.json.jackson.model.HugeDrink;
import com.lxq18.learn.json.jackson.model.StarWand;

import java.io.IOException;

/**
 * @author lixiaoqiang
 * @create 2020/7/19 17:06
 */
public class JacksonDeserializeTest {
    public static void main(String[] args) throws IOException {
        String starWandStr = "{\"superName\":\"superName123\",\"name\":\"Star wand\",\"length\":35,\"price\":120,\"effect\":[\"getting greater\",\"getting handsome\",\"getting rich\"]}";

        String daedalusStr = "{\n" +
                "    \"name\":\"Daedalus\",\n" +
                "    \"weight\":\"5kg\",\n" +
                "    \"damage\":1200,\n" +
                "    \"roles\":[\"assassinator\",\"soldier\"],\n" +
                "    \"origin\":{\n" +
                "             \"name\":\"Mainland of warcraft\",\n" +
                "             \"date\":\"142-12-25\"\n" +
                "    }\n" +
                "}";

        String hugeDrinkStr = "{\n" +
                "    \"name\":\"Huge drink\",\n" +
                "    \"capacity\":500000,\n" +
                "    \"effect\":\"quenching your thirst and tasting good\"\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        /*mapper.registerSubtypes(new NamedType(HugeDrink.class, "Huge drink"));
        mapper.registerSubtypes(new NamedType(Daedalus.class, "Daedalus"));
        mapper.registerSubtypes(new NamedType(StarWand.class, "Star wand"));*/

        StarWand starWand = (StarWand) mapper.readValue(starWandStr, Equipment.class);
        Daedalus daedalus = (Daedalus) mapper.readValue(daedalusStr, Equipment.class);
        HugeDrink hugeDrink = (HugeDrink) mapper.readValue(hugeDrinkStr, Equipment.class);

        System.out.println("大佬！您已获得星空魔杖！属性增幅：" + starWand.getEffect().toString() + "！");
        System.out.println("大佬！您已获得代达罗斯之殇，增加了 " + daedalus.getDamage() + " 点输出！");
        System.out.println("大佬！您已获得代达巨大瓶饮料，it " + hugeDrink.getEffect() + "!");
    }
}
