package service;

import entity.Goods;

public class GoodsService {
    Goods g = new Goods();
    public String[][] data = g.getData();   //이렇게 써도되는지..?

    /**
     * code로 상품 가져오기
     *
     * @param code
     * @return
     */
    public int findByCode(String code) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null && data[i][0].equals(code))
                return i;
        }
        return -1;
    }

    /**
     * 상품을 data에 저장하기
     *
     * @param goods
     * @return
     */
    public String createGoods(String[] goods) {
        if (findByCode(goods[0]) == -1) {
            g.setData(goods);
            return "등록완료";
        } else {
            return "중복된 상품코드";
        }
    }

    /**
     * 모든 상품 가져오기
     *
     * @return
     */
    public String[][] getAll() {
        return data;
    }

    /**
     * 상품 수정 하기
     *
     * @param code
     * @param num    수정할항목이 가격인지 설명인지 가격: 1 설명:2
     * @param update 수정할 내용 가격 or 설명
     */
    public String updateData(String code, int num, String update) {
        int dataIndex = findByCode(code);
        if (dataIndex != -1) {
            if (num == 1) {
                g.updateData(dataIndex, 2, update);
            } else if (num == 2) {
                g.updateData(dataIndex, 3, update);
            }
            return "수정 성공";
        } else {
            return "없는 상품 코드입니다.";
        }
    }

    /**
     * 상품 삭제하기
     *
     * @param code
     * @return
     */
    public String deleteData(String code) {
        int dataIndex = findByCode(code);
        if (dataIndex != -1) {
            g.deleteData(dataIndex);
            return "삭제 성공";
        } else
            return "없는 상품 코드 입니다.";
    }
}
