package seminar_1;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


//Используйте заготовку класса Hero и напишите следующие проверки для объекта Hero с использованием
//  assert:
//        1. Проверить, что герой создался с именем Emmett
//        2. Проверить, что значение прочности брони героя равно 50
//        3. Проверить, что у героя оружие типа sword
//        4. Проверить содержимое инвентаря героя (размер 3, содержимое "Bow", "Axe", "Gold", порядок не важен)
//        5. Проверить, что герой это человек (свойство isHuman)

public class task8 {
    public static void main(String[] args) {

    }

//    public static void checkingHero(Hero hero) {
//        assertThat(hero.getName(), equalTo("Emmett"));
//        assertThat(hero.getArmorStrength(), equalTo(50));
//        assertThat(hero.getWeapon(), equalTo("sword"));
//        assertThat(hero.getBag().isNotEmpty().hasSize(3).contains("Bow", "Axe", "Gold"), equalTo(true));
//        assertThat(hero.isHuman(), equalTo(true));
//    }

    public static class Hero {
        private String name;
        private int armorStrength;
        private String weapon;
        private List<String> bag;
        private boolean isHuman;

        public Hero(String name, int armorStrength, String weapon, List<String> bag, boolean isHuman) {
            this.name = name;
            this.armorStrength = armorStrength;
            this.weapon = weapon;
            this.bag = bag;
            this.isHuman = isHuman;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getArmorStrength() {
            return armorStrength;
        }

        public void setArmorStrength(int armorStrength) {
            this.armorStrength = armorStrength;
        }

        public String getWeapon() {
            return weapon;
        }

        public void setWeapon(String weapon) {
            this.weapon = weapon;
        }

        public List<String> getBag() {
            return bag;
        }

        public void setBag(List<String> bag) {
            this.bag = bag;
        }

        public boolean isHuman() {
            return isHuman;
        }

        public void setHuman(boolean human) {
            isHuman = human;
        }
    }
    public void checkingHero() {
        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);
    }
}
