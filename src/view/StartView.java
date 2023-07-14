package view;

import controller.MenuView;

public class StartView {
    public static void main(String[] args) {
        MenuView menuView = new MenuView();
        while(true){
            System.out.println("1.상품등록  2.전체검색  3. 부분검색  4. 수정  5.삭제  6.종료");
            System.out.print("메뉴를 선택하세요: ");
            menuView.inputData();
        }
    }
}
