package playground.sudoku.core.bean;

/**
 * GUI上の3x3マスのボックスのモデルです
 */
public class SsBoxModel {
    //1-1（上段左）
    private SsCellModel cell1_1;

    //1-2（上段中央）
    private SsCellModel cell1_2;

    //1-3（上段右）
    private SsCellModel cell1_3;

    //2-1（中段左）
    private SsCellModel cell2_1;

    //2-2（中段中央）
    private SsCellModel cell2_2;

    //2-3（中段右）
    private SsCellModel cell2_3;

    //3-1（下段左）
    private SsCellModel cell3_1;

    //3-2（下段中央）
    private SsCellModel cell3_2;

    //3-3（下段右）
    private SsCellModel cell3_3;

    public SsCellModel getCell1_1() {
        return cell1_1;
    }

    public void setCell1_1(SsCellModel cell1_1) {
        this.cell1_1 = cell1_1;
    }

    public SsCellModel getCell1_2() {
        return cell1_2;
    }

    public void setCell1_2(SsCellModel cell1_2) {
        this.cell1_2 = cell1_2;
    }

    public SsCellModel getCell1_3() {
        return cell1_3;
    }

    public void setCell1_3(SsCellModel cell1_3) {
        this.cell1_3 = cell1_3;
    }

    public SsCellModel getCell2_1() {
        return cell2_1;
    }

    public void setCell2_1(SsCellModel cell2_1) {
        this.cell2_1 = cell2_1;
    }

    public SsCellModel getCell2_2() {
        return cell2_2;
    }

    public void setCell2_2(SsCellModel cell2_2) {
        this.cell2_2 = cell2_2;
    }

    public SsCellModel getCell2_3() {
        return cell2_3;
    }

    public void setCell2_3(SsCellModel cell2_3) {
        this.cell2_3 = cell2_3;
    }

    public SsCellModel getCell3_1() {
        return cell3_1;
    }

    public void setCell3_1(SsCellModel cell3_1) {
        this.cell3_1 = cell3_1;
    }

    public SsCellModel getCell3_2() {
        return cell3_2;
    }

    public void setCell3_2(SsCellModel cell3_2) {
        this.cell3_2 = cell3_2;
    }

    public SsCellModel getCell3_3() {
        return cell3_3;
    }

    public void setCell3_3(SsCellModel cell3_3) {
        this.cell3_3 = cell3_3;
    }
}
