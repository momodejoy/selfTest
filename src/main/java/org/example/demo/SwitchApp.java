package org.example.demo;

/**
 * @Description
 * @Date 2021-08-28 15:14
 * @Created by wuyuyan
 */
public class SwitchApp {

    public String direction(String direction){
        String dir = direction.toLowerCase();
        String zhdir = "";
        switch (dir){
            case "up":
                zhdir = "上";
                break;
            case "down":
                zhdir = "下";
                break;
            case "left":
                zhdir = "左";
                break;
            case "right":
                zhdir = "右";
                break;
            default:
                zhdir = "error";
        }
        return zhdir;
    }
}
