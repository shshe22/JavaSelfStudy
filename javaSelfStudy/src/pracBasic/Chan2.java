package pracBasic;

public class Chan2 {
    public static void main(String[] args) {
        Warrior2 warriorA = new HongGilDong2();
        warriorA.weaponA = new Bow2();

        warriorA.attack();
        // 출력 => 홍길동(이)가 활(으)로 공격합니다.

        warriorA = new HongGilSun2();

        warriorA.attack();
        // 출력 => 홍길순(이)가 칼(으)로 공격합니다.

        warriorA.weaponA = new Spear2();
        warriorA.attack();
        // 출력 => 홍길순(이)가 창(으)로 공격합니다.
    }
}

class Warrior2 {
    Weapon2 weaponA = new Weapon2();

    String name;
    String weapon;

    public void attack() {
        System.out.println(name + "(이)가 " + weaponA.attack(weapon) + "(으)로 공격합니다.");
    }
}

class HongGilDong2 extends Warrior2 {

    @Override
    public void attack() {
        name = "홍길동";
        super.attack();
    }
}

class HongGilSun2 extends Warrior2 {

    @Override
    public void attack() {
        name = "홍길순";
        super.attack();
    }
}

class Weapon2 {

    String attack(String weapon) {
        weapon = "칼";
        return weapon;
    }
}

class Bow2 extends Weapon2 {
    String attack(String weapon) {
        weapon = "활";
        return weapon;
    }
}

class Spear2 extends Weapon2 {
    String attack(String weapon) {
        weapon = "창";
        return weapon;
    }
}

