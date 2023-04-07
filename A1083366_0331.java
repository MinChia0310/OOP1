import java.util.Scanner;

class Animal {
    String name;
    double height;
    int weight;
    int speed;

    public Animal(String name, double height, int weight, int speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        
        System.out.print(name + "\t"+ "    ");
        System.out.print(height + "\t"+ "\t"+ "  ");
        System.out.print(weight + "\t"+ "   ");
        System.out.print(speed + "\t"+ " ");
    }

    public double distance(double x, double y) {
        return x * y * speed;
    }

    public double distance(double x) {
        return x * speed;
    }

    public static void showInfo() {
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

class Human extends Animal {
    String gender;

    public Human(String name, double height, int weight, int speed, String gender) {
        super(name, height, weight, speed);
        this.gender = gender;
    }

    public void show() {
        super.show();
        System.out.print(gender+ "\t");
    }
}

class Snow extends Human {
    private String freezeSkill;
    
    public Snow(String name, double height, int weight, int speed, String gender, String freezeSkill) {
        super(name, height, weight, speed, gender);
        this.freezeSkill = freezeSkill;
    }

    public void show() {
        super.show();
        System.out.print(freezeSkill + "\t");
    }

    public double distance(double x, double y) {
        return x * y * speed * 2;
    }

    public double distance(double x) {
        return x * speed * 2;
    }
}



public class A1083366_0331 {
    public static void main(String[] args) {
        Animal.showInfo();
        
        Animal[] animals = {
            new Animal("雪寶", 1.1, 52, 100),
            new Animal("驢子", 1.5, 99, 200),
            new Human("阿克", 1.9, 80, 150, "男"),
            new Human("漢斯", 1.8, 78, 130, "男"),
            new Human("安娜", 1.7, 48, 120, "女"),
            new Snow("愛沙", 1.7, 50, 120, "女", "yes")
        };

        System.out.println("項目姓名 "+" 身高(公尺) "+" 體重(公斤) "+" 速度 "+" 性別 "+" 冰凍技能");
        for (Animal animal : animals) {
            animal.show();
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);

        for (Animal animal : animals) {
            System.out.print(animal.name + "請輸入跑步時間(分鐘): ");
            double x = scanner.nextDouble();
            
            System.out.print(animal.name + "請輸入跑步速度(輸入0則不須): ");
            double y= scanner.nextDouble();
            if (y!=0) {
                System.out.println(animal.name + "跑了 " + animal.distance(x, y) + " 公尺");
            } else {
                System.out.println(animal.name + "跑了 " + animal.distance(x) + " 公尺");
            }
        }

        scanner.close();
    }
}

