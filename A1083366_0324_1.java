import java.util.Scanner;

class Animal {
    String name;
    double height;
    double weight;
    double speed;

    public Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        
        System.out.print(name + "\t"+ "\t");
        System.out.print(height + "\t");
        System.out.print(weight + "\t");
        System.out.print(speed + "\t");
    }

    public double distance(int x, double y) {
        return x * y * speed;
    }

    public double distance(int x) {
        return x * speed;
    }
}

public class A1083366_0324_1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        Scanner scanner = new Scanner(System.in);

        animals[0] = new Animal("雪寶", 1.1, 52, 100);
        animals[1] = new Animal("驢子", 1.5, 99, 200);
        animals[2] = new Animal("安那", 1.7, 48, 120);
        animals[3] = new Animal("愛沙", 1.7, 50, 120);

        System.out.println("項目姓名 "+" 身高(公尺) "+" 體重(公斤) "+" 速度");
        for (Animal animal : animals) {
            animal.show();
            System.out.println();
        }


        for (Animal animal : animals) {
            System.out.print(animal.name + "請輸入時間(分鐘)：");
            int x = scanner.nextInt();
            System.out.print(animal.name + "請輸入加速度(如無須請輸入0)：");
            double y = scanner.nextDouble();
            if(y==0){

                double distance = animal.distance(x);
                System.out.println(animal.name + "奔跑的距離：" + distance + " 公尺\n");
                
            }else{
                
                double distance = animal.distance(x, y);
                System.out.println(animal.name + "奔跑的距離：" + distance + " 公尺\n");
            }

            
        }

        scanner.close();
    }
}
