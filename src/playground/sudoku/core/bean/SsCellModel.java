package playground.sudoku.core.bean;

import java.util.List;

/**
 * 数独における、1マスのセルのモデル
 */
public class SsCellModel {

    /**
     * 表示される番号
     */
    private Integer displayNumber;

    /**
     * メモ用の番号（非表示）、1~9までの数字をリストで保持する
     */
    private List<Integer> candidateNumber;

    public Integer getDisplayNumber() {
        return displayNumber;
    }

    public void setDisplayNumber(Integer displayNumber) {
        this.displayNumber = displayNumber;
    }

    public List<Integer> getMemoNumber() {
        return candidateNumber;
    }

    public void setMemoNumber(List<Integer> memoNumber) {
        this.candidateNumber = memoNumber;
    }

    //表示番号(displayNumber)基準で判定
    private boolean isEmptyCell(){
        return false;
    }
}
