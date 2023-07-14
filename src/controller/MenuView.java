package controller;

import service.GoodsService;
import view.EndView;

import java.util.Scanner;

public class MenuView {
    Scanner sc = new Scanner(System.in);
    GoodsService gs = new GoodsService();
    EndView ev = new EndView();

    public void inputData() {
        String[][] data = gs.data;
        int service = sc.nextInt();//메뉴 선택
        String[] goods = new String[4];

        if (service == 1) {
            System.out.print("상품코드 입력: ");
            goods[0] = sc.next();
            System.out.print("상품이름 입력: ");
            goods[1] = sc.next();
            System.out.print("상품가격 입력: ");
            goods[2] = sc.next();
            System.out.print("상품설명 입력: ");
            goods[3] = sc.next();
            ev.printMessage(gs.createGoods(goods));
        } else if (service == 2) {
            ev.printMessage("***검색성공***");
            ev.getAll(gs.getAll());
        } else if (service == 3) {
            System.out.print("검색할 상품코드: ");
            String code = sc.next();

            if (gs.findByCode(code) == -1)
                ev.printMessage("***상품이 없습니다ㅜㅜ***");
            else {
                ev.printMessage("***상품 검색 성공!!***");
                ev.findByCode(data[gs.findByCode(code)]);
            }
        } else if (service == 4) {
            System.out.print("수정할 상품코드: ");
            String code = sc.next();
            if (gs.findByCode(code) == -1) {
                ev.printMessage("***상품코드에 해당하는 상품이 없습니다.***");
            } else {
                System.out.print("1.가격수정 2.설명수정: ");
                int num = sc.nextInt();
                System.out.print("수정내용: ");
                String update = sc.next();
                ev.printMessage(gs.updateData(code, num, update));
            }
            ev.getAll(gs.getAll());
        } else if (service == 5) {
            System.out.print("삭제할 상품코드: ");
            String code = sc.next();
            ev.printMessage(gs.deleteData(code));

        } else if (service == 6) {
            System.exit(0);
        }

    }
}
