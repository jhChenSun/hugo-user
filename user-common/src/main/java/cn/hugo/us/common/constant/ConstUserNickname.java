package cn.hugo.us.common.constant;

import java.util.Random;
/**
 * @author HugoChen
 * @description  系统花名
 * @date 2022-01-25
 * */
public class ConstUserNickname {
    private final static String NickNameChar[] = new String[]{"赵半仙","花无缺","楚留香","西门吹雪"
    ,"孤独求败","东方不败","金毛狮王","牛魔王","齐天大圣","托塔天王","玉皇大帝","王母娘娘", "白骨精", "太白金星",
            "如来佛祖","观音菩萨","哮天犬","二郎神","千里眼","顺风耳","乔峰","段誉","虚竹","天山童姥","叶二娘",
            "智光大师"};

    /**
     * @author HugoChen
     * @description  随机生成花名
     * @return UserNickName
     * */
    public static String getUserNickName(){
        return NickNameChar[new Random().nextInt(NickNameChar.length)];
    }
}
