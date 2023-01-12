import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<HeavyBox> arrL = new ArrayList<HeavyBox>();
        arrL.add(new HeavyBox("Samsung",12));
        arrL.add(new HeavyBox("Bosch",23));
        arrL.add(new HeavyBox("Ikai",3));
        arrL.add(new HeavyBox("Lenovo",9));

        for (HeavyBox box:arrL) {
            System.out.println(box);
        }
        arrL.get(0).setWeight(1);
        arrL.remove(arrL.size()-1);

        HeavyBox[] boxArray = arrL.toArray(new HeavyBox[0]);
        for (HeavyBox s:boxArray) {
            System.out.println(s);
        }

        arrL.clear();

    }
}
//а) Создать динамический массив, содержащий объекты класса HeavyBox,
// который содержит поля имя и вес.
//б) Распечатать его содержимое используя for each.
//в) Изменить вес первого ящика на 1.
//г) Удалить последний ящик.
//д) Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
//е) Удалить все ящики.