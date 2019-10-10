package com.lambdaschool.zoos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roleid;

    @Column(nullable = false,
            unique = true)
    String name;

    @OneToMany(mappedBy = "role",
                cascade = CascadeType.ALL)
    @JsonIgnoreProperties("role")
    private List<UserRoles> userRolesList

}
