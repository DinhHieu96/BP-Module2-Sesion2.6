import java.util.Scanner;

public class so {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9, 11, 12};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần thêm: ");
        int x = scanner.nextInt();
        System.out.println("Nhập vào vị trí chen số: ");
        int index=scanner.nextInt();

        try
        {
            System.out.println("Hiển thị cac phần tử: ");
            for (int i=0;i<arr.length;i++){
                System.out.println(arr[i]+ " ");
            }
            int[] tempt=new int[arr.length+1];
            if (index==0){
                tempt[index]=x;
            } else {
                for (int i=0;i<tempt.length;i++){
                    if (i<index){
                        tempt[i]=arr[i];
                    } else if (i>index){
                        tempt[i]=arr[i-1];
                    } else {
                        tempt[i]=x;
                    }
                }
            }
            System.out.println();
            System.out.println("Mảng sau khi thêm là : ");
            for (int i=0;i<tempt.length;i++){
                System.out.println(tempt[i]+" ");
            }
        } catch (Exception e) {
            System.out.println("Không có vị trí "+index+" để chèn");
        }



    }
}
