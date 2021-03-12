package springboot_crud.demo.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

/**
 * @description:
 * @author: Tensh
 * @createDate: 2021/3/11
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
@Alias("emp")
public class Employee {
    private Long empId;
    private String empName;
    private SexEnum gender;
    private String email;
    private Department dept;
}
