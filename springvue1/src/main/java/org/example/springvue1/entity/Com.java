package org.example.springvue1.entity;

import lombok.Data;
import javax.persistence.*;
@Entity
@Table(name = "comment")
@Data
public class Com {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nickname;
    private String email;
    private String comment;
}
//import lombok.Data;
//import javax.persistence.*;
//
//@Entity
//@Data
//public class Com {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String nickname;
//    private String email;
//    private String comment;
//}
