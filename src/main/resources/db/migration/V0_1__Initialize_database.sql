create table team
(
    id_team serial,
    name_team varchar,
    player int,
    sponsor int,
    primary key (id_team)
);

create table sponsor
(
    id_sponsor serial,
    name_sponsor int,
    sponsor_team int not null,
    primary key (id_sponsor)
);

create table player
(
    id_player serial,
    name_player varchar,
    number_player int,
    player_team int not null,
    primary key (id_player)
);

create table play_against
(
    id_match serial,
    team_home int,
    opponent int,
    datetime date,
    stadium varchar,
    primary key (id_match)
);

alter table team add constraint fk_id_player FOREIGN KEY (player) references player(id_player);
alter table team add constraint fk_id_sponsor FOREIGN KEY (sponsor) references sponsor(id_sponsor);

alter table sponsor add constraint fk_id_team FOREIGN KEY (sponsor_team) references team(id_team);

alter table player add constraint fk_id_team FOREIGN KEY (player_team) references team(id_team);

alter table play_against add constraint fk_id_team_home FOREIGN KEY (team_home) references team(id_team);
alter table play_against add constraint fk_id_team_other FOREIGN KEY (opponent) references team(id_team);

