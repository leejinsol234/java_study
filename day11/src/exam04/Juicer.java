package exam04;

import java.util.List;

public class Juicer {
    public static void make(Basket<? extends Fruit> basket){//Fruit으로 상한 제한
        //와일드 카드 <?> -> <? extends Object>
        List<?> items = basket.getItems();
        System.out.println(items);
    }



//    public static void make(Basket<Melon> basket){
//        List<Melon> items = basket.getItems();
//        System.out.println(items);
//    }
// 메서드가 호출될 때 생성되므로 그 전에는 동일한 메서드가 되어 중복 정의 오류 발생
}
