package entity;

public class Goods {
    private static String[][] data = {
            {"A01", "새우깡", "2500", "짜고맛나다."},
            {"A02", "치토스", "2000", "맛나다."},
            {"A03", "초코파이", "3500", "짜다."},
            {"A04", "콘칩", "3000", "맛없다."},
            {"A05", "칙촉", "1500", "맛있다."},
    };

    private static int index = 0;

    /**
     * 상품 등록 메서드
     *
     * @param goods
     */
    public void setData(String[] goods) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) { //null값이 있다면 null값에 먼저 추가
                data[i] = goods;
                return;
            }
        }
        this.data[index] = goods;   //null값 없다면 맨앞 index값에 덮어 씌움
        index++;
        if (index % data.length == 0)
            index = 0;
    }

    /**
     * 수정할때 메서드
     *
     * @param codeIndex
     * @param num
     * @param content
     */
    public void updateData(int codeIndex, int num, String content) { //num==2 가격, num==3 설명
        this.data[codeIndex][num] = content;
    }

    /**
     * 삭제할때 메서드
     *
     * @param codeIndex
     */
    public void deleteData(int codeIndex) {
        this.data[codeIndex] = null;
    }

    /**
     * 상품 가져오기
     *
     * @return
     */
    public String[][] getData() {
        return data;
    }

}
