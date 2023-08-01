package pracBasic;

// 전사 a전사 = new 홍길동();
//         a전사.a무기 = new 활();
//
//         a전사.공격();
//         // 출력 => 홍길동(이)가 활(으)로 공격합니다.
//
//         a전사 = new 홍길순();
//
//         a전사.공격();
//         // 출력 => 홍길순(이)가 칼(으)로 공격합니다.
//
//         a전사.a무기 = new 창();
//         a전사.공격();
//         // 출력 => 홍길순(이)가 창(으)로 공격합니다.

public class Chan {
    public static void main(String[] args) {
        Warrior warriorA = new HongGilDong();
        warriorA.weaponA = new Bow();

        warriorA.attack();
        // 출력 => 홍길동(이)가 활(으)로 공격합니다.

        warriorA = new HongGilSun();

        warriorA.attack();
        // 출력 => 홍길순(이)가 칼(으)로 공격합니다.

        warriorA.weaponA = new Spear();
        warriorA.attack();
        // 출력 => 홍길순(이)가 창(으)로 공격합니다.
    }
}

class Warrior {
    Weapon weaponA= new Weapon();
    String name;
    void attack() {
        weaponA.attack(name);
    }
}

class HongGilDong extends Warrior {
    @Override
    void attack() {
        name = "홍길동";
        weaponA.attack(name);
    }
}

class HongGilSun extends Warrior {
    @Override
    void attack() {
        name = "홍길순";
        weaponA.attack(name);
    }
}

class Weapon{

    void attack(String name) {
        System.out.println(name + "(이)가 칼(으)로 공격합니다.");
    }
}

class Bow extends Weapon {
    void attack(String name) {
        System.out.println(name + "(이)가 활(으)로 공격합니다.");
    }
}

class Spear extends Weapon {
    void attack(String name) {
        System.out.println(name + "(이)가 창(으)로 공격합니다.");
    }
}