public class A1083366_0421_1 {
    public static void main(String[] args){
        String mail;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("請輸入您的email（範例：a1083366@mail.nuk.edu.tw）: ");
        mail = input.nextLine();

        if(mail.matches("[a-z]+[0-9]+@[a-z]+.[a-z]+.[a-z]+.[a-z]+")){
            System.out.println("您輸入的email : "+mail+" 是正確的格式。");
        }else{
            System.out.println("您輸入的email : "+mail+" 不是正確的格式。");
        }
    }
}