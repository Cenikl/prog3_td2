create table team
(
    id_team     serial,
    name_team varchar,
    id_player int,
    id_sponsor int,
    primary key (id_team),
    constraint fk_id_player FOREIGN KEY (id_player) references player(id_player),
    constraint fk_id_sponsor FOREIGN KEY (id_sponsor) references sponsor(id_sponsor)
);

create table sponsor
(
    id_sponsor serial,
    name_sponsor varchar,
    id_team int not null,
    primary key (id_sponsor),
    constraint fk_id_team FOREIGN KEY (id_team) references team(id_team)
);

create table player
(
    id_player serial,
    name_player varchar,
    number_player int,
    id_team int not null,
    primary key (id_player),
    constraint fk_id_team FOREIGN KEY (id_team) references team(id_team)
);

create table play_against
(
    id_match int,
    id_team_home int,
    id_team_other int,
    datetime date,
    stadium varchar,
    primary key (id_match),
    constraint fk_id_team_home FOREIGN KEY (id_team_home) references team(id_team),
    constraint fk_id_team_other FOREIGN KEY (id_team_other) references team(id_team)
)