package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sinhVien arr[] = new sinhVien[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new sinhVien();
			System.out.println(" Nhập Sinh Viên Thứ : " + (i+1));
			arr[i].name = sc.nextLine();
			arr[i].old = sc.nextInt();
			sc.nextLine();
			arr[i].diemToan =sc.nextFloat();
			sc.nextLine();
			arr[i].diemLy =sc.nextFloat();
			sc.nextLine();
			arr[i].diemHoa =sc.nextFloat();
			sc.nextLine();
			System.out.println("Diem Trung binh" + arr[i].dtb );
			System.out.println(arr[i].dtb = (arr[i].diemToan + arr[i].diemHoa + arr[i].diemLy) / 3);
			}
			System.out.println("---------------------------");
			
			for (int i = 0; i < arr.length; i++) {
				sinhVien p = arr[i];
				System.out.format("Ten: %S - Tuoi: %d - Diem Toan: %.2f - Diem Hoa :%.2f - Diem Ly :%.2f - Diem Trung Binh :%.2f  ",arr[i].name,arr[i].old,arr[i].diemHoa,arr[i].diemLy,arr[i].diemToan,arr[i].dtb );
				System.out.println("------------------------------");
			}
			sinhVien max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if(max.dtb < arr[i].dtb)
					max = arr[i];
			}
			System.out.format("Nguoi co diem trung binh cao nhat:%s - Diem Trung Binh :%.2f " ,max.name, max.dtb);			 		                    					       		                		           
		    }
}
	


