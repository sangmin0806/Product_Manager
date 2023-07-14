package view;

public class EndView {
    /**
     * 문자 출력 메서드
     *
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * 모든 상품 출력
     *
     * @param data
     */
    public void getAll(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                for (int j = 0; j < data[i].length; j++) {
                    System.out.print(data[i][j] + " ");
                }
            } else
                System.out.print("null ");

            System.out.println();
        }
    }

    /**
     * code에 맞는 데이터 출력
     *
     * @param goods
     */
    public void findByCode(String[] goods) {
        for (int i = 0; i < goods.length; i++) {
            if (goods[i] != null)
                System.out.print(goods[i] + " ");
        }
        System.out.println();
    }

}
