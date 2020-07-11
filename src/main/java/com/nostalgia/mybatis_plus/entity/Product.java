package com.nostalgia.mybatis_plus.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author nostalgia
 * @since 2020-07-11
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Product implements Serializable {

    private static final long serialVersionUID=1L;

      private Integer id;

    private String name;

    private Integer userId;


}
