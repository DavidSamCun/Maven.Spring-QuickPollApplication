package io.zipcoder.tc_spring_poll_application.domain;

import javax.persistence.*;

@Entity
public class Vote {

    @Id
    @GeneratedValue
    @Column(name = "VOTE_ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    Option option;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public Option getOption() {
        return option;
    }
}