package com.xhn.hilihili.admin.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author xhn
 * @email hain.xiao@outlook.com
 * @date 2023/4/12 14:36
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageImagesListVo {
    private Integer currentPage;
    private Integer size;
    private Integer total;
    private Integer showStatus;
    private String des;
    @NotNull(message = "type不能为空")
    private Integer type;
}
