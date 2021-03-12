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
@Alias("dept")
public class Department {
    private Long deptId;
    private String deptName;
}
