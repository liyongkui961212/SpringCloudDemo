package com.study.common.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author LiYongKui
 * @version 1.0
 * @date 2021/2/24 10:51
 */
@Data
@Entity
@Table
public class Payment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serial;
}
