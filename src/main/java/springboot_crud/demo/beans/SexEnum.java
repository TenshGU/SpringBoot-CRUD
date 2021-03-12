package springboot_crud.demo.beans;

/**
 * @description:
 * @author: Tensh
 * @createDate: 2021/3/11
 */
public enum  SexEnum {

    male(1,"男"),female(2,"女");

    /**
     * 编号
     */
    private Integer num;
    /**
     * 性别
     */
    private String sex;

    private SexEnum(Integer num, String sex) {
        this.num = num;
        this.sex = sex;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static SexEnum getSexEnumByNum(Integer num) {
        switch (num) {
            case 1:
                return male;
            default:
                return female;
        }
    }
}
